package jry.clonefieldCFL;

import jry.evaluation.AbstractPTATransformer;
import jry.evaluation.LogPTATransformer;
import jry.util.*;
import soot.*;
import soot.jimple.*;
import soot.jimple.internal.JNewArrayExpr;
import soot.toolkits.scalar.ArraySparseSet;
import soot.toolkits.scalar.Pair;
import vasco.callgraph.CallGraphTransformer;

import java.io.File;
import java.util.*;
import java.util.stream.Collectors;

class SootObjectWithCallsite {
    private ArrayList<Pair<SootMethod, Integer>> cloneStack;
    Object u;
    SootMethod m;

    SootObjectWithCallsite(Object u, SootMethod m, int depth, LinkedList<Pair<SootMethod, Integer>> callStack) {
        cloneStack = new ArrayList<>();
        this.u = u;
        this.m = m;
        int num = Math.min(depth, callStack.size() - 1);
        for (int i = 0; i < num; ++i) {
            cloneStack.add(callStack.get(i + 1));
        }
    }

    @Override
    public int hashCode() {
        return cloneStack.hashCode() + u.hashCode() + m.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof SootObjectWithCallsite)) {
            return false;
        }
        SootObjectWithCallsite obj1 = (SootObjectWithCallsite)obj;
        return cloneStack.equals(obj1.cloneStack) && u.equals(obj1.u) && m.equals(obj1.m);
    }

    @Override
    public String toString() {
        StringBuilder b = new StringBuilder();
        b.append(u);
        b.append("@");
        b.append(m);
        for (Pair p: cloneStack) {
            b.append("\n  ");
            b.append(p);
        }
        return b.toString();
    }
}

public class CloneFieldCFLTransformer extends LogPTATransformer {
    int depth = 2;
    Set<SootObjectWithCallsite> nodeList = new HashSet<>();
    SootMethod DUMMY_METHOD;



    CFLGraphBuilder graphBuilder = new CFLGraphBuilder();
    Set<SootObjectWithCallsite> isVisited = new HashSet<SootObjectWithCallsite>();
    Map<Integer, Local> queries = new TreeMap<Integer, Local>();
    LinkedList<Pair<SootMethod, Integer>> callStack = new LinkedList<>();
    int totalNew = 0;
    public Map<Integer, ArraySparseSet<Integer>> result = new TreeMap<Integer, ArraySparseSet<Integer>>();

    public Map<Integer, ArraySparseSet<Integer>> getResult() {
        return result;
    }

    class FakeFieldRef {
        Local base;
        Object key;
        public FakeFieldRef(Local _base, Object _key) {
            base = _base;
            key = _key;
        }

        @Override
        public int hashCode() {
            return base.hashCode() + key.hashCode();
        }

        @Override
        public boolean equals(Object obj) {
            if (!(obj instanceof FakeFieldRef)) return false;
            return base.equals(((FakeFieldRef) obj).base) && key.equals(((FakeFieldRef) obj).key);
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

    private void assignPar(SootMethod sMethod, SootMethod oldMethod, List<Value> args) {
        if (sMethod.hasActiveBody()) {
            for (Unit unit : sMethod.getActiveBody().getUnits()) {
                if (unit instanceof DefinitionStmt) {
                    if (((DefinitionStmt) unit).getRightOp() instanceof ParameterRef) {
                        ParameterRef right = (ParameterRef)((DefinitionStmt) unit).getRightOp();
                        // System.out.println("[FindPar] " + right);
                        Local left = (Local)((DefinitionStmt) unit).getLeftOp();
                        int where = right.getIndex();
                        if (args.get(where) instanceof Local) {
                            // System.out.println("    [Link] " + left + " " + args.get(where));
                            // Pair<SootMethod, Integer> head = callStack.removeFirst();
                            SootObjectWithCallsite wherem = new SootObjectWithCallsite(args.get(where), oldMethod, depth, callStack);
                            // callStack.addFirst(head);
                            callStack.addFirst(new Pair<>(sMethod, 1)); // dummy
                            SootObjectWithCallsite leftm = new SootObjectWithCallsite(left, sMethod, depth, callStack);
                            callStack.removeFirst();
                            /*System.out.println("-----");
                            System.out.println(wherem);
                            System.out.println(leftm);*/
                            nodeList.add(wherem);
                            nodeList.add(leftm);
                            graphBuilder.addEdge(wherem, leftm, 3, 0);
                            graphBuilder.addEdge(leftm, wherem, -3, 0);
                        }
                    }
                }
            }
        } else assert false;
    }

    private void assignThis(SootMethod sMethod, SootMethod oldMethod, Local base) {
        if (sMethod.hasActiveBody()) {
            // System.out.println(sMethod.getActiveBody());
            for (Unit unit : sMethod.getActiveBody().getUnits()) {
                if (unit instanceof DefinitionStmt) {
                    Value right = ((DefinitionStmt) unit).getRightOp();
                    Object left = getValue(((DefinitionStmt) unit).getLeftOp());
                    if (right instanceof ThisRef) {
                        if ((left instanceof Local) || (left instanceof SootField)) {
                            SootObjectWithCallsite basem = new SootObjectWithCallsite(base, oldMethod, depth, callStack);
                            callStack.addFirst(new Pair<>(sMethod, 1)); // dummy
                            SootObjectWithCallsite leftm = new SootObjectWithCallsite(left, sMethod, depth, callStack);
                            callStack.removeFirst();
                            /*System.out.println("-----");
                            System.out.println(basem);
                            System.out.println(leftm);*/
                            nodeList.add(basem);
                            nodeList.add(leftm);
                            graphBuilder.addEdge(basem, leftm, 3, 0);
                            graphBuilder.addEdge(leftm, basem, -3, 0);
                        } else if (left instanceof FakeFieldRef) {
                            Local LeftBase = ((FakeFieldRef)left).base;
                            SootObjectWithCallsite LeftBasem = new SootObjectWithCallsite(LeftBase, sMethod, depth, callStack);
                            SootObjectWithCallsite basem = new SootObjectWithCallsite(base, sMethod, depth, callStack);
                            /*System.out.println("-----");
                            System.out.println(LeftBasem);
                            System.out.println(basem);*/
                            nodeList.add(LeftBasem);
                            nodeList.add(basem);
                            graphBuilder.addEdge(basem, LeftBasem, 4, ((FakeFieldRef)left).key);
                            graphBuilder.addEdge(LeftBasem, basem, -5, ((FakeFieldRef)left).key);
                        } else {
                            assert false;
                        }
                    }
                }
            }
        }
    }


    private List<Local> getReturnObj(SootMethod sMethod) {
        List<Local> ret = new ArrayList<>();
        for (Unit unit : sMethod.getActiveBody().getUnits()) {
            if (unit instanceof ReturnStmt) {
                ret.add((Local)((ReturnStmt)unit).getOp());
                //return (Local)((ReturnStmt)unit).getOp();
            }
        }
        return ret;
        //assert false;
        //return null;
    }

    private void resolveCall(SootMethod sMethod, SootMethod oldMethod, InvokeExpr ie) {
        assignPar(sMethod, oldMethod, ie.getArgs());
        if (ie instanceof StaticInvokeExpr) {
        } else if (ie instanceof InstanceInvokeExpr) {
            InstanceInvokeExpr iie = (InstanceInvokeExpr) ie;
            Local base = (Local) iie.getBase();
            assignThis(sMethod, oldMethod, base);
        } else assert false;
    }

    private void dfsMethod(SootMethod sMethod) {
        callStack.addFirst(new Pair<>(sMethod, 1)); // dummy
        SootObjectWithCallsite methodWithCallsite = new SootObjectWithCallsite(sMethod, sMethod, depth, callStack);
        callStack.removeFirst();
        if (isVisited.contains(methodWithCallsite)) {
            return;
        }
        // System.out.println("[New Method] " + sMethod);
        isVisited.add(methodWithCallsite);
        // Set<SootMethod> callMethods = new HashSet<SootMethod>();
        if (sMethod.hasActiveBody()) {
            int allocId = 0;
            AllocRef allocRef = new AllocRef(0);
            // System.out.println(sMethod.getActiveBody());
            int line = 0;
            for (Unit unit : sMethod.getActiveBody().getUnits()) {
                callStack.addFirst(new Pair<>(sMethod, line));
                line++;
                //System.out.println("  [Unit] " + unit + " " + unit.getClass());
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
                            resolveCall(nextMethod, sMethod, ie);
                            dfsMethod(nextMethod);
                            // callMethods.add(nextMethod);
                        }
                    }
                } else if (unit instanceof DefinitionStmt) {
                    //System.out.println("[DefinitionStmt] " + unit + " " + unit.getClass());
                    Object right = getValue(((DefinitionStmt) unit).getRightOp());
                    //ystem.out.println(right.getClass() + " " + right);
                    Object left = getValue(((DefinitionStmt) unit).getLeftOp());
                    SootObjectWithCallsite leftm = new SootObjectWithCallsite(left, sMethod, depth, callStack);
                    SootObjectWithCallsite rightm = new SootObjectWithCallsite(right, sMethod, depth, callStack);
                    if (left instanceof SootField) {
                        SootField sfr = (SootField)left;
                        leftm = new SootObjectWithCallsite(sfr, DUMMY_METHOD, depth, new LinkedList<>());
                    }
                    if (right instanceof SootField) {
                        SootField sfr = (SootField)right;
                        rightm = new SootObjectWithCallsite(sfr, DUMMY_METHOD, depth, new LinkedList<>());
                    }
                    if (right instanceof NewExpr || right instanceof NewArrayExpr || right instanceof NewMultiArrayExpr) {
                        //System.out.println("-----");
                        //System.out.println(leftm);
                        totalNew += 1;
                        allocRef = new AllocRef(totalNew);
                        graphBuilder.assignAllocId(allocRef, allocId);
                        nodeList.add(leftm);
                        graphBuilder.addEdge(allocRef, leftm, 1, 0);
                        graphBuilder.addEdge(leftm, allocRef, -1, 0);
                        allocId = 0;
                    } else if ((right instanceof Local) || (right instanceof SootField)) {
                        if ((left instanceof Local) || (left instanceof SootField)) {
                            /*System.out.println("-----");
                            System.out.println(leftm);
                            System.out.println(rightm);*/
                            nodeList.add(leftm);
                            nodeList.add(rightm);
                            graphBuilder.addEdge(rightm, leftm, 3, 0);
                            graphBuilder.addEdge(leftm, rightm, -3, 0);
                        } else if (left instanceof FakeFieldRef) {
                            Local base = ((FakeFieldRef)left).base;
                            SootObjectWithCallsite basem = new SootObjectWithCallsite(base, sMethod, depth, callStack);
                            /*System.out.println("-----");
                            System.out.println(basem);
                            System.out.println(rightm);*/
                            nodeList.add(basem);
                            nodeList.add(rightm);
                            graphBuilder.addEdge(rightm, basem, 4,((FakeFieldRef)left).key);
                            graphBuilder.addEdge(basem, rightm, -5, ((FakeFieldRef)left).key);
                        } else {
                            assert false;
                        }
                    } else if (right instanceof FakeFieldRef) {
                        Local base = ((FakeFieldRef)right).base;
                        SootObjectWithCallsite basem = new SootObjectWithCallsite(base, sMethod, depth, callStack);
                        /*System.out.println("-----");
                        System.out.println(basem);
                        System.out.println(leftm);*/
                        nodeList.add(basem);
                        nodeList.add(leftm);
                        graphBuilder.addEdge(basem, leftm, -4, ((FakeFieldRef)right).key);
                        graphBuilder.addEdge(leftm, basem, 5, ((FakeFieldRef)right).key);
                    } else if (right instanceof ParameterRef) {
                    } else if (right instanceof InvokeExpr){
                        InvokeExpr ie = (InvokeExpr)right;
                        List<SootMethod> nextMethods = CallGraphGenerator.resolveTarget(unit);
                        for (SootMethod nextMethod : nextMethods) {
                            // callMethods.add(nextMethod);
                            resolveCall(nextMethod, sMethod, ie);
                            dfsMethod(nextMethod);
                            for (Object returnObj : getReturnObj(nextMethod)) {
                                // Object returnObj = getReturnObj(nextMethod);
                                callStack.addFirst(new Pair<>(sMethod, line)); // dummy
                                SootObjectWithCallsite returnm = new SootObjectWithCallsite(returnObj, nextMethod, depth, callStack);
                                /*System.out.println("-----");
                                System.out.println(returnm);
                                System.out.println(leftm);*/
                                callStack.removeFirst();
                                if ((left instanceof Local) || (left instanceof SootField)) {
                                    nodeList.add(returnm);
                                    nodeList.add(leftm);
                                    graphBuilder.addEdge(returnm, leftm, 3, 0);
                                    graphBuilder.addEdge(leftm, returnm, -3, 0);
                                } else if (left instanceof FakeFieldRef) {
                                    Local base = ((FakeFieldRef)left).base;
                                    SootObjectWithCallsite basem = new SootObjectWithCallsite(base, sMethod, depth, callStack);
                                    nodeList.add(returnm);
                                    nodeList.add(basem);
                                    graphBuilder.addEdge(basem, returnm, 4, ((FakeFieldRef)left).key);
                                    graphBuilder.addEdge(returnm, basem, -5, ((FakeFieldRef)left).key);
                                }
                            }
                        }
                    } else if (right instanceof Constant) {
                    } else if (right instanceof ThisRef || right instanceof BinopExpr || right instanceof UnopExpr) {
                    } else if (right instanceof NewArrayExpr || right instanceof NewMultiArrayExpr) {
                    } else assert false;
                } else
                    assert CallGraphGenerator.resolveTarget(unit).isEmpty();
                callStack.removeFirst();
            }
            /*
            for (SootMethod callMethod : callMethods) {
                dfsMethod(callMethod, depth);
            }*/
        }
    }

    @Override
    protected void myInternalTransform(String s, Map<String, String> map) {
        SootMethod mainMethod = Scene.v().getMainMethod();
        DUMMY_METHOD = mainMethod;
        callStack.addFirst(new Pair<>(mainMethod, -1));

        callStack.addFirst(new Pair<>(mainMethod, -1));
        List<Local> pa = mainMethod.getActiveBody().getParameterLocals();
        for (int i = 0; i < pa.size(); ++i) {
            SootObjectWithCallsite para = new SootObjectWithCallsite(pa.get(i), mainMethod, depth, callStack);
            totalNew += 1;
            NewArrayExpr nae = new JNewArrayExpr(pa.get(i).getType(), IntConstant.v(100));
            AllocRef allocRef = new AllocRef(totalNew);
            graphBuilder.assignAllocId(allocRef, 0);
            graphBuilder.addEdge(allocRef, para, 1, 0);
            graphBuilder.addEdge(para, allocRef, -1, 0);
        }
        callStack.removeFirst();

        dfsMethod(mainMethod);
        callStack.removeFirst();
        graphBuilder.addAllSelf(3);
        graphBuilder.addAllSelf(-3);
        graphBuilder.doAnalysis(CFLLib.FieldCFL, CFLLib.FieldCFLName);
        for (Map.Entry<Integer, Local> entry : queries.entrySet()) {
            List<SootObjectWithCallsite> entries = nodeList.stream().filter(n -> n.u.equals(entry.getValue())).collect(Collectors.toList());
            for (SootObjectWithCallsite m : entries) {
                if (!result.containsKey(entry.getKey()))
                    result.put(entry.getKey(), new ArraySparseSet<>());
                result.get(entry.getKey()).union(graphBuilder.getPointTo(m, -2));
            }
        }
    }

    public static void main(String args[]) {
        CloneFieldCFLTransformer ipat = new CloneFieldCFLTransformer();
        PackManager.v().getPack("wjtp").add(new Transform("wjtp.fcpa", new CallGraphTransformer()));
        PackManager.v().getPack("wjtp").add(new Transform("wjtp.ipa", ipat));
        String dir = "./resources";
        String classpath = dir
                + File.pathSeparator + dir + File.separator + "rt.jar"
                + File.pathSeparator + dir + File.separator + "jce.jar";
        System.out.println(classpath);
        String className = "dataset.Test6";

        soot.Main.main(new String[]{
                "-w",
                "-app", //"-pp",
                "-keep-line-number",
                "-keep-bytecode-offset",
                "-p", "cg", "implicit-entry:false",
                "-p", "cg.spark", "enabled",
                "-p", "cg.spark", "simulate-natives",
                "-p", "cg", "safe-forname",
                "-p", "cg", "safe-newinstance",
                "-p", "wjtp.fcpa", "enabled:true",
                "-p", "wjtp.ipa", "enabled:true",
                "-soot-class-path", classpath,
                "-main-class", className,
                "-f", "J",
                className
        });
        ResultOperator result = new ResultOperator(ipat.result);
        System.out.println(result);
    }
}
