package jry.basicfieldCFL;

import jry.util.CFLGraphBuilder;
import jry.util.CFLLib;
import jry.util.CallGraphGenerator;
import soot.*;
import soot.jimple.*;
import soot.toolkits.scalar.ArraySparseSet;

import java.util.*;

public class BasicFieldCFLTreansformer extends SceneTransformer {
    CFLGraphBuilder graphBuilder = new CFLGraphBuilder();
    Set<SootMethod> isVisited = new HashSet<SootMethod>();
    Map<Integer, Local> queries = new TreeMap<Integer, Local>();
    int totalNew = 0;
    public Map<Integer, ArraySparseSet<Integer>> result = new TreeMap<Integer, ArraySparseSet<Integer>>();

    private Object getValue(Value var) {
        if (var instanceof ArrayRef) {
            return ((ArrayRef) var).getBase();
        } else if (var instanceof StaticFieldRef) {
            return ((StaticFieldRef) var).getFieldRef();
        }
        return var;
    }

    private void assignPar(SootMethod sMethod, List<Value> args) {
        if (sMethod.hasActiveBody()) {
            for (Unit unit : sMethod.getActiveBody().getUnits()) {
                if (unit instanceof DefinitionStmt) {
                    if (((DefinitionStmt) unit).getRightOp() instanceof ParameterRef) {
                        ParameterRef right = (ParameterRef)((DefinitionStmt) unit).getRightOp();
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
        }
    }

    private void dfsMethod(SootMethod sMethod) {
        if (isVisited.contains(sMethod)) {
            return;
        }
        System.out.println("[New Method] " + sMethod);
        isVisited.add(sMethod);
        Set<SootMethod> callMethods = new HashSet<SootMethod>();
        if (sMethod.hasActiveBody()) {
            int allocId = 0;
            System.out.println(sMethod.getActiveBody());
            for (Unit unit : sMethod.getActiveBody().getUnits()) {
                // System.out.println("  [Unit] " + unit + " " + unit.getClass());
                if (unit instanceof InvokeStmt) {
                    InvokeExpr ie = ((InvokeStmt) unit).getInvokeExpr();
                    if (ie.getMethod().toString().equals("<benchmark.internal.Benchmark: void alloc(int)>")) {
                        allocId = ((IntConstant) ie.getArgs().get(0)).value;
                        totalNew += 1;
                        graphBuilder.assignAllocId(totalNew, allocId);
                    } else if (ie.getMethod().toString().equals("<benchmark.internal.Benchmark: void test(int,java.lang.Object)>")) {
                        Local var = (Local)ie.getArgs().get(1);
                        int id = ((IntConstant)ie.getArgs().get(0)).value;
                        queries.put(id, var);
                    } else {
                        List<SootMethod> nextMethods = CallGraphGenerator.resolveTarget(unit);

                        /*for (SootMethod nextMethod : nextMethods) {
                            System.out.println("    [Candidate] " + nextMethod);
                        }*/

                        for (SootMethod nextMethod : nextMethods) {
                            assignPar(nextMethod, ie.getArgs());
                            callMethods.add(nextMethod);
                        }
                    }
                } else {
                    assert CallGraphGenerator.resolveTarget(unit).isEmpty();
                    if (unit instanceof DefinitionStmt) {
                        Object right = getValue(((DefinitionStmt) unit).getRightOp());
                        Object left = getValue(((DefinitionStmt) unit).getLeftOp());
                        if (right instanceof NewExpr) {
                            graphBuilder.addEdge(allocId, left, 1, 0);
                            graphBuilder.addEdge(left, allocId, -1, 0);
                        } else if ((right instanceof Local) || (right instanceof SootFieldRef)) {
                            if ((left instanceof Local) || (left instanceof SootFieldRef)) {
                                graphBuilder.addEdge(right, left, 3, 0);
                                graphBuilder.addEdge(left, right, -3, 0);
                            } else if (left instanceof InstanceFieldRef) {
                                Local base = (Local)(((InstanceFieldRef) left).getBase());
                                graphBuilder.addEdge(right, base, 4, ((InstanceFieldRef) left).getFieldRef());
                                graphBuilder.addEdge(base, right, -5, ((InstanceFieldRef) left).getFieldRef());
                            } else {
                                assert false;
                            }
                        } else if (right instanceof InstanceFieldRef) {
                            Local base = (Local)((InstanceFieldRef) right).getBase();
                            graphBuilder.addEdge(base, left, -4, ((InstanceFieldRef) right).getFieldRef());
                            graphBuilder.addEdge(left, base, 5, ((InstanceFieldRef) right).getFieldRef());
                        } else if (right instanceof ParameterRef) {
                        } else {
                            assert false;
                        }
                    }
                }
            }
            for (SootMethod callMethod : callMethods) {
                dfsMethod(callMethod);
            }
        }
    }

    @Override
    protected void internalTransform(String s, Map<String, String> map) {
        SootMethod mainMethod = Scene.v().getMainMethod();
        dfsMethod(mainMethod);
        graphBuilder.doAnalysis(CFLLib.FieldCFL, CFLLib.FieldCFLName);
        for (Map.Entry<Integer, Local> entry : queries.entrySet()) {
            result.put(entry.getKey(), graphBuilder.getPointTo(entry.getValue(), -2));
        }
    }
}
