package jry.basicfieldCFL;

import jry.evaluation.AbstractPTATransformer;
import jry.evaluation.LogPTATransformer;
import jry.util.*;
import soot.*;
import soot.jimple.*;
import soot.jimple.internal.JNewArrayExpr;
import soot.toolkits.scalar.ArraySparseSet;
import soot.util.Switch;
import utils.AnswerPrinter;
import vasco.callgraph.CallGraphTransformer;
import soot.util.Chain;

import java.io.File;
import java.util.*;


public class BasicFieldCFLTransformer extends LogPTATransformer {
    CFLGraphBuilder graphBuilder = new CFLGraphBuilder();
    Set<SootMethod> isVisited = new HashSet<SootMethod>();
    Map<Integer, Local> queries = new TreeMap<Integer, Local>();
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

    private void assignPar(SootMethod sMethod, List<Value> args) {
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
                            graphBuilder.addEdge(args.get(where), left, 3, 0);
                            graphBuilder.addEdge(left, args.get(where), -3, 0);
                        }
                    }
                }
            }
        } else assert false;
    }

    private void assignThis(SootMethod sMethod, Local base) {
        if (sMethod.hasActiveBody()) {
            // System.out.println(sMethod.getActiveBody());
            for (Unit unit : sMethod.getActiveBody().getUnits()) {
                if (unit instanceof DefinitionStmt) {
                    Value right = ((DefinitionStmt) unit).getRightOp();
                    Object left = getValue(((DefinitionStmt) unit).getLeftOp());
                    if (right instanceof ThisRef) {
                        if ((left instanceof Local) || (left instanceof SootField)) {
                            graphBuilder.addEdge(base, left, 3, 0);
                            graphBuilder.addEdge(left, base, -3, 0);
                        } else if (left instanceof FakeFieldRef) {
                            Local LeftBase = (((FakeFieldRef) left).base);
                            graphBuilder.addEdge(base, LeftBase, 4, ((FakeFieldRef) left).key);
                            graphBuilder.addEdge(LeftBase, base, -5, ((FakeFieldRef) left).key);
                        } else {
                            assert false;
                        }
                    }
                }
            }
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

    private void resolveCall(SootMethod sMethod, InvokeExpr ie) {
        assignPar(sMethod, ie.getArgs());
        if (ie instanceof StaticInvokeExpr) {
        } else if (ie instanceof InstanceInvokeExpr) {
            InstanceInvokeExpr iie = (InstanceInvokeExpr) ie;
            Local base = (Local) iie.getBase();
            assignThis(sMethod, base);
        } else assert false;
    }

    private void dfsMethod(SootMethod sMethod) {
        if (isVisited.contains(sMethod)) {
            return;
        }
        //System.out.println("[New Method] " + sMethod);
        isVisited.add(sMethod);
        Set<SootMethod> callMethods = new HashSet<SootMethod>();
        if (sMethod.hasActiveBody()) {
            int allocId = 0;
            AllocRef allocRef = new AllocRef(0);
            //System.out.println(sMethod.getActiveBody());
            for (Unit unit : sMethod.getActiveBody().getUnits()) {
                //System.out.println("  [Unit] " + unit + " " + unit.getClass());
                if (unit instanceof InvokeStmt) {
                    InvokeExpr ie = ((InvokeStmt) unit).getInvokeExpr();
                    if (ie.getMethod().toString().equals("<benchmark.internal.BenchmarkN: void alloc(int)>")) {
                        allocId = ((IntConstant) ie.getArgs().get(0)).value;
                    } else if (ie.getMethod().toString().equals("<benchmark.internal.BenchmarkN: void test(int,java.lang.Object)>")) {
                        Local var = (Local) getValue(ie.getArgs().get(1));
                        int id = ((IntConstant) ie.getArgs().get(0)).value;
                        queries.put(id, var);
                    } else {
                        List<SootMethod> nextMethods = CallGraphGenerator.resolveTarget(unit);
                        for (SootMethod nextMethod : nextMethods) {
                            resolveCall(nextMethod, ie);
                            callMethods.add(nextMethod);
                        }
                    }
                } else if (unit instanceof DefinitionStmt) {
                    //System.out.println("[DefinitionStmt] " + unit + " " + unit.getClass());
                    Object right = getValue(((DefinitionStmt) unit).getRightOp());
                    //System.out.println(right.getClass() + " " + right);
                    Object left = getValue(((DefinitionStmt) unit).getLeftOp());
                    //System.out.println(left.getClass() + " " + left);
                    if (right instanceof NewExpr || right instanceof NewArrayExpr || right instanceof NewMultiArrayExpr) {
                        totalNew += 1;
                        allocRef = new AllocRef(totalNew);
                        // System.out.println("assign" + left + " " + allocId);
                        graphBuilder.assignAllocId(allocRef, allocId);
                        graphBuilder.addEdge(allocRef, left, 1, 0);
                        graphBuilder.addEdge(left, allocRef, -1, 0);
                        allocId = 0;
                    } else if ((right instanceof Local) || (right instanceof SootField)) {
                        if ((left instanceof Local) || (left instanceof SootField)) {
                            graphBuilder.addEdge(right, left, 3, 0);
                            graphBuilder.addEdge(left, right, -3, 0);
                        } else if (left instanceof FakeFieldRef) {
                            Local base = (Local) ((FakeFieldRef) left).base;
                            graphBuilder.addEdge(right, base, 4, ((FakeFieldRef) left).key);
                            graphBuilder.addEdge(base, right, -5, ((FakeFieldRef) left).key);
                        } else {
                            assert false;
                        }
                    } else if (right instanceof FakeFieldRef) {
                        Local base = (Local) ((FakeFieldRef) right).base;
                        //System.out.println(base + " " + ((InstanceFieldRef) right).getField());
                        graphBuilder.addEdge(base, left, -4, ((FakeFieldRef) right).key);
                        graphBuilder.addEdge(left, base, 5, ((FakeFieldRef) right).key);
                    } else if (right instanceof ParameterRef) {
                    } else if (right instanceof InvokeExpr){
                        InvokeExpr ie = (InvokeExpr)right;
                        List<SootMethod> nextMethods = CallGraphGenerator.resolveTarget(unit);
                        for (SootMethod nextMethod : nextMethods) {
                            callMethods.add(nextMethod);
                            resolveCall(nextMethod, ie);
                            List<Local> returnObjs = getReturnObj(nextMethod);
                            for (Local returnObj: returnObjs) {
                                if ((left instanceof Local) || (left instanceof SootField)) {
                                    graphBuilder.addEdge(returnObj, left, 3, 0);
                                    graphBuilder.addEdge(left, returnObj, -3, 0);
                                } else if (left instanceof FakeFieldRef) {
                                    graphBuilder.addEdge(((FakeFieldRef) left).base, returnObj, 4, ((FakeFieldRef) left).key);
                                    graphBuilder.addEdge(returnObj, ((FakeFieldRef) left).base, -5, ((FakeFieldRef) left).key);
                                }
                            }
                        }
                    } else if (right instanceof Constant) {
                    } else if (right instanceof ThisRef || right instanceof BinopExpr || right instanceof UnopExpr) {
                    } else if (right instanceof NewArrayExpr || right instanceof NewMultiArrayExpr) {
                    } else ;//assert false;
                } else assert CallGraphGenerator.resolveTarget(unit).isEmpty();
            }
            for (SootMethod callMethod : callMethods) {
                dfsMethod(callMethod);
            }
        }
    }

    protected void myInternalTransform(String s, Map<String, String> map) {
        SootMethod mainMethod = Scene.v().getMainMethod();


        List<Local> pa = mainMethod.getActiveBody().getParameterLocals();
        for (int i = 0; i < pa.size(); ++i) {
            totalNew += 1;
            NewArrayExpr nae = new JNewArrayExpr(pa.get(i).getType(), IntConstant.v(100));
            AllocRef allocRef = new AllocRef(totalNew);
            graphBuilder.assignAllocId(allocRef, 0);
            graphBuilder.addEdge(allocRef, pa.get(i), 1, 0);
            graphBuilder.addEdge(pa.get(i), allocRef, -1, 0);
        }

        dfsMethod(mainMethod);
        graphBuilder.addAllSelf(3);
        graphBuilder.addAllSelf(-3);
        /*Chain<SootClass> sootClasses = Scene.v().getClasses();
        for (SootClass sootClass : sootClasses) {
            System.out.println(sootClass.getFields());
        }*/

        graphBuilder.doAnalysis(CFLLib.FieldCFL, CFLLib.FieldCFLName);
        for (Map.Entry<Integer, Local> entry : queries.entrySet()) {
            result.put(entry.getKey(), graphBuilder.getPointTo(entry.getValue(), -2));
        }
        ResultOperator resultOp = new ResultOperator(result);
        AnswerPrinter.printAnswer(resultOp.toString());
    }

    public static void main(String args[]) {
        BasicFieldCFLTransformer ipat = new BasicFieldCFLTransformer();
        PackManager.v().getPack("wjtp").add(new Transform("wjtp.fcpa", new CallGraphTransformer()));
        PackManager.v().getPack("wjtp").add(new Transform("wjtp.ipa", ipat));
        String dir = "./resources";
        String classpath = dir
                + File.pathSeparator + dir + File.separator + "rt.jar"
                + File.pathSeparator + dir + File.separator + "jce.jar";
        System.out.println(classpath);
        String className = "test.HelloArray";

        soot.Main.main(new String[]{
                "-w",
                "-app",
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
