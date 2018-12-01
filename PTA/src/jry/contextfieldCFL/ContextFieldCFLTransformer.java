package jry.contextfieldCFL;

import jry.evaluation.LogPTATransformer;
import jry.util.AllocRef;
import jry.util.CFLGraphBuilder;
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
    public Local root;

    @Override
    public int hashCode() {
        return (root.hashCode() + "," + trace.hashCode()).hashCode();
    }

    @Override
    public String toString() {
        return root.toString() + trace.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof LocalRef)) return false;
        return root.equals(((LocalRef)obj).root) &&  trace.equals(((LocalRef)obj).trace);
    }

    public LocalRef(Local _root) {
        root = _root;
        trace = -1;
    }

    public LocalRef(Local _root, SootField _trace) {
        root = _root;
        trace = _trace;
    }

    public LocalRef add(SootField currentField) {
        if (trace instanceof SootField)
            return new LocalRef(root, (SootField)trace);
        else return new LocalRef(root, currentField);
    }
}

// Open 1
public class ContextFieldCFLTransformer extends LogPTATransformer {
    CFLGraphBuilder graphBuilder = new CFLGraphBuilder();
    Set<SootMethod> isVisit = new HashSet<>();
    Map<Integer, Local> queries = new TreeMap<>();
    public Map<Integer, ArraySparseSet<Integer>> result = new TreeMap<>();
    int depth = 1;
    int totalNew = 0;

    class AssignEdge {
        Object v;
        // type0: v = u, type1: v.x = u, type2: v = u.x;
        int type;
        SootField sField;
        Unit callPosition;
        public AssignEdge(Object _local, int _type, SootField _sField, Unit _callPosition) {
            v = _local; type = _type; sField = _sField; callPosition = _callPosition;
        }
    }

    Map<Object, LinkedList<AssignEdge>> assignGraph = new HashMap<>();
    Map<Object, Set<LocalRef>> usedLocalRef = new HashMap<>();
    Queue<LocalRef> localRefQueue = new LinkedList<>();

    public ContextFieldCFLTransformer(int _depth) {
        depth = _depth;
    }

    @Override
    public Map<Integer, ArraySparseSet<Integer>> getResult() {
        return result;
    }

    @Override
    protected void myInternalTransform(String s, Map<String, String> map) {
        SootMethod mainMethod = Scene.v().getMainMethod();
        generateAssignGraph(mainMethod);
    }

    private Object getValue(Value var) {
        if (var instanceof ArrayRef) {
            return ((ArrayRef) var).getBase();
        } else if (var instanceof StaticFieldRef) {
            assert false;
        }
        return var;
    }

    void assignGraphResolveCall(SootMethod method, InvokeExpr ie) {

    }

    void initNode(Object u) {
        if (!assignGraph.containsKey(u)) {
            assignGraph.put(u, new LinkedList<>());
        }
        if (!usedLocalRef.containsKey(u)) {
            usedLocalRef.put(u, new HashSet<>());
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
        if (sMethod.hasActiveBody()) {
            int allocId = 0;
            AllocRef allocRef = new AllocRef(0);
            for (Unit unit : sMethod.getActiveBody().getUnits()) {
                if (unit instanceof InvokeStmt) {
                    InvokeExpr ie = ((InvokeStmt) unit).getInvokeExpr();
                    if (ie.getMethod().toString().equals("<benchmark.internal.Benchmark: void alloc(int)>")) {
                        allocId = ((IntConstant) ie.getArgs().get(0)).value;
                        totalNew += 1;
                        allocRef = new AllocRef(totalNew);
                    } else if (ie.getMethod().toString().equals("<benchmark.internal.Benchmark: void test(int,java.lang.Object)>")) {
                        Local var = (Local) ie.getArgs().get(1);
                        int id = ((IntConstant) ie.getArgs().get(0)).value;
                        queries.put(id, var);
                    } else {
                        List<SootMethod> nextMethods = CallGraphGenerator.resolveTarget(unit);
                        for (SootMethod nextMethod : nextMethods) {
                            assignGraphResolveCall(nextMethod, ie);
                            callMethods.add(nextMethod);
                        }
                    }
                } else if (unit instanceof DefinitionStmt) {
                    // System.out.println("[DefinitionStmt] " + unit + " " + unit.getClass());
                    Object right = getValue(((DefinitionStmt) unit).getRightOp());
                    // System.out.println(right.getClass() + " " + right);
                    Object left = getValue(((DefinitionStmt) unit).getLeftOp());
                    if (right instanceof NewExpr || right instanceof NewArrayExpr || right instanceof NewMultiArrayExpr) {
                        addAssignEdge(left, allocRef, null);
                        if (right instanceof NewExpr) {
                            SootClass baseClass = ((NewExpr) right).getBaseType().getSootClass();
                            List<LocalRef> localRefs = openNew((Local)left, baseClass);
                            localRefQueue.addAll(localRefs);
                            usedLocalRef.get(allocRef).addAll(localRefs);
                        }
                        allocRef = new AllocRef(0);
                    } else if (right instanceof Local) {
                        if (left instanceof Local) {
                            addAssignEdge(left, right, null);
                        } else if (left instanceof InstanceFieldRef) {
                            Local base = (Local) (((InstanceFieldRef) left).getBase());
                            addAssignEdge(base, ((InstanceFieldRef) left).getField(), right, null);
                        } else {
                            assert false;
                        }
                    } else if (right instanceof InstanceFieldRef) {
                        Local base = (Local) ((InstanceFieldRef) right).getBase();
                        addAssignEdge(left, base, ((InstanceFieldRef) right).getField(), null);
                    } else if (right instanceof ParameterRef) {
                    } else if (right instanceof InvokeExpr){
                        InvokeExpr ie = (InvokeExpr)right;
                        List<SootMethod> nextMethods = CallGraphGenerator.resolveTarget(unit);
                        for (SootMethod nextMethod : nextMethods) {
                            callMethods.add(nextMethod);
                            assignGraphResolveCall(nextMethod, ie);
                            List<Local> returnObjs = getReturnObj(nextMethod);
                            for (Local returnObj: returnObjs) {
                                if (left instanceof Local) {
                                    addAssignEdge(left, returnObj, unit);
                                } else if (left instanceof InstanceFieldRef) {
                                    addAssignEdge(((InstanceFieldRef) left).getBase(), returnObj, ((InstanceFieldRef) left).getField(), unit);
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

    List<LocalRef> openNew(Local local, SootClass sClass) {
        List<LocalRef> result = new LinkedList<>();
        LocalRef base = new LocalRef(local);
        for (SootField sField : getAllFields(sClass)) {
            result.add(base.add(sField));
        }
        return result;
    }

    void addAssignEdge(Object u, Object v, Unit callPosition) {
        initNode(u);
        initNode(v);
        assignGraph.get(v).add(new AssignEdge(u, 0, null, callPosition));
    }

    void addAssignEdge(Local u, SootField sField, Object v, Unit callPosition) {
        initNode(u);
        initNode(v);
        assignGraph.get(v).add(new AssignEdge(v, 1, sField, callPosition));
    }

    void addAssignEdge(Object u, Local v, SootField sField, Unit callPosition) {
        initNode(u);
        initNode(v);
        assignGraph.get(v).add(new AssignEdge(v, 2, sField, callPosition));
    }
}
