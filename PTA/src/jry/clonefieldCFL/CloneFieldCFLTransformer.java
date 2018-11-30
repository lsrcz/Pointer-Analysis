package jry.clonefieldCFL;

import jry.evaluation.AbstractPTATransformer;
import jry.util.CFLGraphBuilder;
import jry.util.CFLLib;
import jry.util.CallGraphGenerator;
import jry.util.ResultOperator;
import soot.*;
import soot.jimple.*;
import soot.toolkits.scalar.ArraySparseSet;
import soot.toolkits.scalar.Pair;
import vasco.callgraph.CallGraphTransformer;

import java.io.File;
import java.util.*;
import java.util.stream.Collectors;

class AllocRef {
    Integer id;

    @Override
    public int hashCode() {
        return ("AllocRef" + id).hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof AllocRef)) {
            return false;
        }
        return id.equals(((AllocRef) obj).id);
    }

    public AllocRef(int _id) {
        id = _id;
    }
}

class MethodWithCallsite {
    private ArrayList<Pair<SootMethod, Integer>> cloneStack;
    Object u;
    SootMethod m;

    MethodWithCallsite(Object u, SootMethod m, int depth, LinkedList<Pair<SootMethod, Integer>> callStack) {
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
        if (!(obj instanceof MethodWithCallsite)) {
            return false;
        }
        MethodWithCallsite obj1 = (MethodWithCallsite)obj;
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

public class CloneFieldCFLTransformer extends AbstractPTATransformer {
    int depth = 2;
    Set<MethodWithCallsite> nodeList = new HashSet<>();
    SootMethod DUMMY_METHOD;



    CFLGraphBuilder graphBuilder = new CFLGraphBuilder();
    Set<MethodWithCallsite> isVisited = new HashSet<MethodWithCallsite>();
    Map<Integer, Local> queries = new TreeMap<Integer, Local>();
    LinkedList<Pair<SootMethod, Integer>> callStack = new LinkedList<>();
    int totalNew = 0;
    public Map<Integer, ArraySparseSet<Integer>> result = new TreeMap<Integer, ArraySparseSet<Integer>>();

    public Map<Integer, ArraySparseSet<Integer>> getResult() {
        return result;
    }

    private Object getValue(Value var) {
        if (var instanceof ArrayRef) {
            return ((ArrayRef) var).getBase();
        } else if (var instanceof StaticFieldRef) {
            return ((StaticFieldRef) var).getFieldRef();
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
                            MethodWithCallsite wherem = new MethodWithCallsite(args.get(where), oldMethod, depth, callStack);
                            // callStack.addFirst(head);
                            callStack.addFirst(new Pair<>(sMethod, 1)); // dummy
                            MethodWithCallsite leftm = new MethodWithCallsite(left, sMethod, depth, callStack);
                            callStack.removeFirst();
                            System.out.println("-----");
                            System.out.println(wherem);
                            System.out.println(leftm);
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
                        if ((left instanceof Local) || (left instanceof SootFieldRef)) {
                            MethodWithCallsite basem = new MethodWithCallsite(base, oldMethod, depth, callStack);
                            callStack.addFirst(new Pair<>(sMethod, 1)); // dummy
                            MethodWithCallsite leftm = new MethodWithCallsite(left, sMethod, depth, callStack);
                            callStack.removeFirst();
                            System.out.println("-----");
                            System.out.println(basem);
                            System.out.println(leftm);
                            nodeList.add(basem);
                            nodeList.add(leftm);
                            graphBuilder.addEdge(basem, leftm, 3, 0);
                            graphBuilder.addEdge(leftm, basem, -3, 0);
                        } else if (left instanceof InstanceFieldRef) {
                            Local LeftBase = (Local) (((InstanceFieldRef) left).getBase());
                            MethodWithCallsite LeftBasem = new MethodWithCallsite(LeftBase, sMethod, depth, callStack);
                            MethodWithCallsite basem = new MethodWithCallsite(base, sMethod, depth, callStack);
                            System.out.println("-----");
                            System.out.println(LeftBasem);
                            System.out.println(basem);
                            nodeList.add(LeftBasem);
                            nodeList.add(basem);
                            graphBuilder.addEdge(basem, LeftBasem, 4, ((InstanceFieldRef) left).getFieldRef());
                            graphBuilder.addEdge(LeftBasem, basem, -5, ((InstanceFieldRef) left).getFieldRef());
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
        MethodWithCallsite methodWithCallsite = new MethodWithCallsite(sMethod, sMethod, depth, callStack);
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
                // System.out.println("  [Unit] " + unit + " " + unit.getClass());
                if (unit instanceof InvokeStmt) {
                    InvokeExpr ie = ((InvokeStmt) unit).getInvokeExpr();
                    if (ie.getMethod().toString().equals("<benchmark.internal.Benchmark: void alloc(int)>")) {
                        allocId = ((IntConstant) ie.getArgs().get(0)).value;
                        totalNew += 1;
                        allocRef = new AllocRef(totalNew);
                        graphBuilder.assignAllocId(allocRef, allocId);
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
                    // System.out.println("[DefinitionStmt] " + unit + " " + unit.getClass());
                    Object right = getValue(((DefinitionStmt) unit).getRightOp());
                    // System.out.println(right.getClass() + " " + right);
                    Object left = getValue(((DefinitionStmt) unit).getLeftOp());
                    MethodWithCallsite leftm = new MethodWithCallsite(left, sMethod, depth, callStack);
                    MethodWithCallsite rightm = new MethodWithCallsite(right, sMethod, depth, callStack);
                    if (left instanceof SootFieldRef) {
                        if (((SootFieldRef)left).isStatic()) {
                            SootFieldRef sfr = (SootFieldRef)left;
                            leftm = new MethodWithCallsite(new Pair<>(sfr.name(), sfr.type()), DUMMY_METHOD, depth, new LinkedList<>());
                            //leftm = new MethodWithCallsite(left, DUMMY_METHOD, depth, new LinkedList<>());
                        }
                    }
                    if (right instanceof SootFieldRef) {
                        if (((SootFieldRef)right).isStatic()) {
                            //rightm = new MethodWithCallsite(right, DUMMY_METHOD, depth, new LinkedList<>());
                            SootFieldRef sfr = (SootFieldRef)right;
                            rightm = new MethodWithCallsite(new Pair<>(sfr.name(), sfr.type()), DUMMY_METHOD, depth, new LinkedList<>());
                        }
                    }
                    if (right instanceof NewExpr) {
                        System.out.println("-----");
                        System.out.println(leftm);
                        nodeList.add(leftm);
                        graphBuilder.addEdge(allocRef, leftm, 1, 0);
                        graphBuilder.addEdge(leftm, allocRef, -1, 0);
                    } else if ((right instanceof Local) || (right instanceof SootFieldRef)) {
                        if ((left instanceof Local) || (left instanceof SootFieldRef)) {
                            System.out.println("-----");
                            System.out.println(leftm);
                            System.out.println(rightm);
                            nodeList.add(leftm);
                            nodeList.add(rightm);
                            graphBuilder.addEdge(rightm, leftm, 3, 0);
                            graphBuilder.addEdge(leftm, rightm, -3, 0);
                        } else if (left instanceof InstanceFieldRef) {
                            Local base = (Local) (((InstanceFieldRef) left).getBase());
                            MethodWithCallsite basem = new MethodWithCallsite(base, sMethod, depth, callStack);
                            System.out.println("-----");
                            System.out.println(basem);
                            System.out.println(rightm);
                            nodeList.add(basem);
                            nodeList.add(rightm);
                            graphBuilder.addEdge(rightm, basem, 4, ((InstanceFieldRef) left).getFieldRef());
                            graphBuilder.addEdge(basem, rightm, -5, ((InstanceFieldRef) left).getFieldRef());
                        } else {
                            assert false;
                        }
                    } else if (right instanceof InstanceFieldRef) {
                        Local base = (Local) ((InstanceFieldRef) right).getBase();
                        MethodWithCallsite basem = new MethodWithCallsite(base, sMethod, depth, callStack);
                        System.out.println("-----");
                        System.out.println(basem);
                        System.out.println(leftm);
                        nodeList.add(basem);
                        nodeList.add(leftm);
                        graphBuilder.addEdge(basem, leftm, -4, ((InstanceFieldRef) right).getFieldRef());
                        graphBuilder.addEdge(leftm, basem, 5, ((InstanceFieldRef) right).getFieldRef());
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
                                MethodWithCallsite returnm = new MethodWithCallsite(returnObj, nextMethod, depth, callStack);
                                System.out.println("-----");
                                System.out.println(returnm);
                                System.out.println(leftm);
                                nodeList.add(returnm);
                                nodeList.add(leftm);
                                callStack.removeFirst();
                                if ((left instanceof Local) || (left instanceof SootFieldRef)) {
                                    graphBuilder.addEdge(returnm, leftm, 3, 0);
                                    graphBuilder.addEdge(leftm, returnm, -3, 0);
                                } else if (left instanceof InstanceFieldRef) {
                                    graphBuilder.addEdge(leftm, returnm, 4, ((InstanceFieldRef) left).getFieldRef());
                                    graphBuilder.addEdge(returnm, leftm, -5, ((InstanceFieldRef) left).getFieldRef());
                                }
                            }
                        }
                    } else if (right instanceof Constant) {
                    } else if (right instanceof ThisRef || right instanceof BinopExpr || right instanceof UnopExpr) {
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
    protected void internalTransform(String s, Map<String, String> map) {
        SootMethod mainMethod = Scene.v().getMainMethod();
        DUMMY_METHOD = mainMethod;
        callStack.addFirst(new Pair<>(mainMethod, -1));
        dfsMethod(mainMethod);
        callStack.removeFirst();
        graphBuilder.doAnalysis(CFLLib.FieldCFL, CFLLib.FieldCFLName);
        for (Map.Entry<Integer, Local> entry : queries.entrySet()) {
            List<MethodWithCallsite> entries = nodeList.stream().filter(n -> n.u.equals(entry.getValue())).collect(Collectors.toList());
            for (MethodWithCallsite m : entries) {
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
        String className = "dataset.Test8";

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
