package jry.contextfieldCFL;

import jry.clonefieldCFL.CloneFieldCFLTransformer;
import jry.evaluation.LogPTATransformer;
import jry.util.AllocRef;
import jry.util.CFLGraphBuilder;
import jry.util.CFLLib;
import jry.util.CallGraphGenerator;
import soot.*;
import soot.jimple.*;
import soot.jimple.parser.node.AArrayNewExpr;
import soot.toolkits.scalar.ArraySparseSet;
import soot.util.queue.QueueReader;

import java.lang.reflect.Method;
import java.util.*;

class LocalRef{
    public Object trace;
    public Object root;

    @Override
    public int hashCode() {
        return (root.hashCode() + ", " + trace.hashCode()).hashCode();
    }

    @Override
    public String toString() {
        return root.toString() + ", " + trace.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof LocalRef)) return false;
        return root.equals(((LocalRef)obj).root) &&  trace.equals(((LocalRef)obj).trace);
    }

    public LocalRef(Object _root) {
        root = _root;
        trace = -1;
    }

    public LocalRef(Object _root, Object _trace) {
        root = _root;
        trace = _trace;
    }

    public LocalRef add(Object currentField) {
        if (trace.equals(-1)) return new LocalRef(root, currentField);
        else return new LocalRef(root, trace);
    }
}

// Open 1
public class ContextFieldCFLTransformer extends LogPTATransformer {
    CFLGraphBuilder graphBuilder = new CFLGraphBuilder();
    Set<SootMethod> isVisit = new HashSet<>();
    Map<Integer, Local> queries = new TreeMap<>();
    public Map<Integer, ArraySparseSet<Integer>> result = new TreeMap<>();
    public Map<LocalRef, LocalRef> fatherRef = new HashMap<>();

    int depth = 1;
    int totalNew = 0;

    class FakeFieldRef {
        Local base;
        Object key;
        public FakeFieldRef(Local _base, Object _key) {
            base = _base;
            key = _key;
        }
    }

    class AssignEdge {
        Object v;
        // type0: v = u, type1: v.x = u, type2: v = u.x;
        int type;
        Object sField;
        Unit callPosition;
        int callType;
        public AssignEdge(Object _local, int _type, Object _sField, Unit _callPosition, int _callType) {
            v = _local; type = _type; sField = _sField; callPosition = _callPosition; callType = _callType;
        }

        @Override
        public String toString() {
            return "edge(" + v + " " + type + " " + sField + ")";
        }
    }

    Map<Object, LinkedList<AssignEdge>> assignGraph = new HashMap<>();
    Map<Object, Set<LocalRef>> usedLocalRef = new HashMap<>();
    Queue<LocalRef> localRefQueue = new LinkedList<>();
    Map<Object, Set<Object>> localRefFlowGraph = new HashMap<Object, Set<Object>>();
    Map<AllocRef, Integer> allocMap = new HashMap<>();

    public ContextFieldCFLTransformer() {
    }

    @Override
    public Map<Integer, ArraySparseSet<Integer>> getResult() {
        return result;
    }

    @Override
    protected void myInternalTransform(String s, Map<String, String> map) {
        SootMethod mainMethod = Scene.v().getMainMethod();
        generateAssignGraph(mainMethod);
        getAllUsedLocalRef();
        buildGraph();
        graphBuilder.doAnalysis(CFLLib.ContextCFL, CFLLib.ContextCFLName);
        for (Map.Entry<Integer, Local> entry : queries.entrySet()) {
            result.put(entry.getKey(), graphBuilder.getPointTo(findRoot(new LocalRef(entry.getValue())), 2));
        }
    }

    void tryInsertNewLocalRef(LocalRef localRef) {
        Object root = localRef.root;
        if (usedLocalRef.get(root).contains(localRef)) return;
        // System.out.println("[LocalRef] " + localRef);
        usedLocalRef.get(root).add(localRef);
        localRefQueue.add(localRef);
    }

    void addinGraph(LocalRef u, LocalRef v, Unit callPosition, int callType) {
        if (callPosition == null) {
            graphBuilder.addEdge(u, v, 0, 0);
        } else {
            graphBuilder.addEdge(u, v, callType, callPosition);
        }
    }

    LocalRef findRoot(LocalRef currentRef) {
        if (fatherRef.get(currentRef).equals(currentRef)) return currentRef;
        LocalRef res = findRoot(fatherRef.get(currentRef));
        fatherRef.put(currentRef, res);
        return res;
    }

    void link(LocalRef u, LocalRef v) {
        //System.out.println(u + " = " + v);
        u = findRoot(u);
        v = findRoot(v);
        if (u == v) return;
        fatherRef.put(u, v);
    }

    void calcFatherMap() {
        for (Map.Entry<Object, LinkedList<AssignEdge>> entry : assignGraph.entrySet()) {
            for (LocalRef localRef : usedLocalRef.get(entry.getKey())) {
                fatherRef.put(localRef, localRef);
            }
        }
        for (Map.Entry<Object, LinkedList<AssignEdge>> entry : assignGraph.entrySet()) {
            for (AssignEdge edge : entry.getValue()) {
                Object u = entry.getKey();
                Object v = edge.v;
                if (u instanceof AllocRef) continue;
                if (v instanceof AllocRef) continue;
                if (edge.callPosition != null) continue;
                Set<LocalRef> uLocalRef = usedLocalRef.get(u);
                Set<LocalRef> vLocalRef = usedLocalRef.get(v);
                //System.out.println("[BuildGraph] " + entry.getKey() + " " + edge);
                if (edge.type == 0) {
                    for (LocalRef localRef : uLocalRef) {
                        LocalRef localRefLeft = new LocalRef(v, localRef.trace);
                        assert vLocalRef.contains(localRefLeft);
                        link(localRefLeft, localRef);
                    }
                } if (edge.type == 1){
                    //v.x = u
                    for (LocalRef localRef : uLocalRef) {
                        LocalRef localRefLeft = new LocalRef(v, edge.sField);
                        assert vLocalRef.contains(localRefLeft);
                        link(localRefLeft, localRef);
                    }
                } else if (edge.type == 2) {
                    // v = u.x
                    for (LocalRef localRef : vLocalRef) {
                        LocalRef localRefRight = new LocalRef(u, edge.sField);
                        assert uLocalRef.contains(localRefRight);
                        link(localRefRight, localRef);
                    }
                }
            }
        }
        for (Map.Entry<Object, LinkedList<AssignEdge>> entry : assignGraph.entrySet()) {
            for (LocalRef localRef : usedLocalRef.get(entry.getKey())) {
                //System.out.println(localRef + " , " + findRoot(localRef));
            }
        }

    }

    void buildGraph() {
        assert usedLocalRef.size() == assignGraph.size();
        calcFatherMap();
        for (Map.Entry<Object, LinkedList<AssignEdge>> entry : assignGraph.entrySet()) {
            for (AssignEdge edge : entry.getValue()) {
                Object u = entry.getKey();
                Object v = edge.v;
                Set<LocalRef> uLocalRef = usedLocalRef.get(u);
                Set<LocalRef> vLocalRef = usedLocalRef.get(v);
                //System.out.println("[BuildGraph] " + entry.getKey() + " " + edge);
                if (edge.type == 0) {
                    for (LocalRef localRef : uLocalRef) {
                        LocalRef localRefLeft = new LocalRef(v, localRef.trace);
                        assert vLocalRef.contains(localRefLeft);
                        // System.out.println(localRefLeft + " -> " + localRef);
                        addinGraph(findRoot(localRefLeft), findRoot(localRef), edge.callPosition, edge.callType);
                        addinGraph(findRoot(localRef), findRoot(localRefLeft), edge.callPosition, edge.callType);
                    }
                } if (edge.type == 1){
                    //v.x = u
                    for (LocalRef localRef : uLocalRef) {
                        LocalRef localRefLeft = new LocalRef(v, edge.sField);
                        assert vLocalRef.contains(localRefLeft);
                        addinGraph(findRoot(localRefLeft), findRoot(localRef), edge.callPosition, edge.callType);
                    }
                } else if (edge.type == 2) {
                    // v = u.x
                    for (LocalRef localRef : vLocalRef) {
                        LocalRef localRefRight = new LocalRef(u, edge.sField);
                        assert uLocalRef.contains(localRefRight);
                        addinGraph(findRoot(localRef), findRoot(localRefRight), edge.callPosition, edge.callType);
                    }
                }
            }
        }
        for (Map.Entry<AllocRef, Integer> entry : allocMap.entrySet()) {
            graphBuilder.assignAllocId(findRoot(new LocalRef(entry.getKey())), entry.getValue());
        }
        graphBuilder.addAllSelf(2);
    }

    void getAllUsedLocalRef(){
        while (!localRefQueue.isEmpty()) {
            LocalRef fir = localRefQueue.remove();
            //System.out.println("[NewLocalRef] " + fir);
            Object root = fir.root;
            for (Object v : localRefFlowGraph.get(root)) {
                tryInsertNewLocalRef(new LocalRef(v, fir.trace));
            }
        }
    }

    private Object getValue(Value var) {
        if (var instanceof ArrayRef) {
            return new FakeFieldRef((Local)((ArrayRef) var).getBase(), "fake");
        } else if (var instanceof StaticFieldRef) {
            return ((StaticFieldRef) var).getField();
        } else if (var instanceof InstanceFieldRef) {
            return new FakeFieldRef((Local)((InstanceFieldRef) var).getBase(), ((InstanceFieldRef) var).getField());
        }
        return var;
    }

    void assignThis(SootMethod sMethod, Local base, Unit location) {
        if (sMethod.hasActiveBody()) {
            for (Unit unit : sMethod.getActiveBody().getUnits()) {
                if (unit instanceof DefinitionStmt) {
                    Value right = ((DefinitionStmt) unit).getRightOp();
                    if (right instanceof ThisRef) {
                        Object left = getValue(((DefinitionStmt) unit).getLeftOp());
                        addAssignEdge(left, base, location, 1);
                        addAssignEdge(base, left, location, -1);
                    }
                }
            }
        }
    }

    void assignPar(SootMethod sMethod, List<Value> args, Unit location) {
        if (sMethod.hasActiveBody()) {
            for (Unit unit : sMethod.getActiveBody().getUnits()) {
                if (unit instanceof  DefinitionStmt) {
                    if (((DefinitionStmt) unit).getRightOp() instanceof ParameterRef) {
                        ParameterRef right = (ParameterRef)((DefinitionStmt) unit).getRightOp();
                        // System.out.println("[FindPar] " + right);
                        Local left = (Local)((DefinitionStmt) unit).getLeftOp();
                        int where = right.getIndex();
                        if (args.get(where) instanceof Local) {
                            addAssignEdge(left, args.get(where), location, 1);
                        }
                    }
                }
            }
        }
    }

    void assignGraphResolveCall(SootMethod sMethod, InvokeExpr ie, Unit location) {
        assignPar(sMethod, ie.getArgs(), location);
        if (ie instanceof InstanceInvokeExpr) {
            InstanceInvokeExpr iie = (InstanceInvokeExpr) ie;
            Local base = (Local) iie.getBase();
            assignThis(sMethod, base, location);
        }
    }

    void initNode(Object u) {
        if (!assignGraph.containsKey(u)) {
           // System.out.println("[InitNode] " + u);
            assignGraph.put(u, new LinkedList<>());
        }
        if (!usedLocalRef.containsKey(u)) {
            usedLocalRef.put(u, new HashSet<>());
            tryInsertNewLocalRef(new LocalRef(u));
        }
        if (!localRefFlowGraph.containsKey(u)) {
            localRefFlowGraph.put(u, new HashSet<>());
        }
    }

    private List<Local> getReturnObj(SootMethod sMethod) {
        List<Local> results = new LinkedList<>();
        for (Unit unit : sMethod.getActiveBody().getUnits()) {
            if (unit instanceof ReturnStmt) {
                results.add((Local)((ReturnStmt) unit).getOp());
            }
        }
        assert !results.isEmpty();
        return results;
    }

    void generateAssignGraph(SootMethod sMethod) {
        if (isVisit.contains(sMethod)) return;
        isVisit.add(sMethod);
        Set<SootMethod> callMethods = new HashSet<>();
        //System.out.println("[NewMethod] " + sMethod);
        //System.out.println(sMethod.getActiveBody());
        if (sMethod.hasActiveBody()) {
            int allocId = 0;
            AllocRef allocRef = new AllocRef(0);
            for (Unit unit : sMethod.getActiveBody().getUnits()) {
                if (unit instanceof InvokeStmt) {
                    InvokeExpr ie = ((InvokeStmt) unit).getInvokeExpr();
                    if (ie.getMethod().toString().equals("<benchmark.internal.Benchmark: void alloc(int)>")) {
                        allocId = ((IntConstant) ie.getArgs().get(0)).value;
                    } else if (ie.getMethod().toString().equals("<benchmark.internal.Benchmark: void test(int,java.lang.Object)>")) {
                        Local var = (Local) ie.getArgs().get(1);
                        int id = ((IntConstant) ie.getArgs().get(0)).value;
                        queries.put(id, var);
                    } else {
                        List<SootMethod> nextMethods = CallGraphGenerator.resolveTarget(unit);
                        for (SootMethod nextMethod : nextMethods) {
                            assignGraphResolveCall(nextMethod, ie, unit);
                            callMethods.add(nextMethod);
                        }
                    }
                } else if (unit instanceof DefinitionStmt) {
                    Object right = getValue(((DefinitionStmt) unit).getRightOp());
                    Object left = getValue(((DefinitionStmt) unit).getLeftOp());
                    if (right instanceof NewExpr || right instanceof NewArrayExpr || right instanceof NewMultiArrayExpr) {
                        totalNew += 1;
                        allocRef = new AllocRef(totalNew);
                        allocMap.put(allocRef, allocId);
                        addAssignEdge(left, allocRef, null, 0);
                        /*if (right instanceof NewExpr) {
                            SootClass baseClass = ((NewExpr) right).getBaseType().getSootClass();
                            List<LocalRef> localRefs = openNew(allocRef, baseClass);
                            for (LocalRef localRef : localRefs) {
                                tryInsertNewLocalRef(localRef);
                            }
                        }*/
                        allocId = 0;
                    } else if (right instanceof Local || right instanceof SootField) {
                        if (left instanceof Local || left instanceof SootField) {
                            addAssignEdge(left, right, null, 0);
                        } else if (left instanceof FakeFieldRef) {
                            Local base = ((FakeFieldRef)left).base;
                            addAssignEdge(base, ((FakeFieldRef)left).key, right, null, 0);
                        } else {
                            assert false;
                        }
                    } else if (right instanceof FakeFieldRef) {
                        Local base = ((FakeFieldRef)right).base;
                        addAssignEdge(left, base, ((FakeFieldRef)right).key, null, 0);
                    } else if (right instanceof ParameterRef) {
                    } else if (right instanceof InvokeExpr){
                        InvokeExpr ie = (InvokeExpr)right;
                        List<SootMethod> nextMethods = CallGraphGenerator.resolveTarget(unit);
                        for (SootMethod nextMethod : nextMethods) {
                            callMethods.add(nextMethod);
                            assignGraphResolveCall(nextMethod, ie, unit);
                            List<Local> returnObjs = getReturnObj(nextMethod);
                            for (Local returnObj: returnObjs) {
                                if (left instanceof Local || left instanceof SootField) {
                                    addAssignEdge(left, returnObj, unit, -1);
                                } else if (left instanceof FakeFieldRef) {
                                    addAssignEdge(((FakeFieldRef)left).base, returnObj, ((FakeFieldRef)left).key, unit, -1);
                                }
                            }
                        }
                    } else if (right instanceof Constant) {
                    } else if (right instanceof ThisRef || right instanceof BinopExpr || right instanceof UnopExpr) {
                    } else assert false;
                } else assert CallGraphGenerator.resolveTarget(unit).isEmpty();
            }
            for (SootMethod callMethod : callMethods) {
                generateAssignGraph(callMethod);
            }
        }
    }

    List<SootField> getAllFields(SootClass sClass) {
        List<SootField> result = new LinkedList<>();
        while (true) {
            result.addAll(sClass.getFields());
            if (sClass.hasSuperclass()) {
                sClass = sClass.getSuperclass();
            } else break;
        }
        return result;
    }

    List<LocalRef> openNew(Object local, SootClass sClass) {
        List<LocalRef> result = new LinkedList<>();
        LocalRef base = new LocalRef(local);
        for (SootField sField : getAllFields(sClass)) {
            result.add(base.add(sField));
        }
        return result;
    }

    void addAssignEdge(Object u, Object v, Unit callPosition, int callType) {
        initNode(u);
        initNode(v);
        assignGraph.get(v).add(new AssignEdge(u, 0, null, callPosition, callType));
        localRefFlowGraph.get(v).add(u);
        localRefFlowGraph.get(u).add(v);
        //System.out.println("[Link] " + u + " " + v);
    }

    void addAssignEdge(Local u, Object sField, Object v, Unit callPosition, int callType) {
        initNode(u);
        initNode(v);
        tryInsertNewLocalRef(new LocalRef(u, sField));
        assignGraph.get(v).add(new AssignEdge(u, 1, sField, callPosition, callType));
    }

    void addAssignEdge(Object u, Object v, Object sField, Unit callPosition, int callType) {
        initNode(u);
        initNode(v);
        tryInsertNewLocalRef(new LocalRef(v, sField));
        assignGraph.get(v).add(new AssignEdge(u, 2, sField, callPosition, callType));

    }
}
