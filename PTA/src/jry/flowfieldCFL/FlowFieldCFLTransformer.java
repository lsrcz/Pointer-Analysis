package jry.flowfieldCFL;

import jry.clonefieldCFL.CloneFieldCFLTransformer;
import jry.evaluation.LogPTATransformer;
import jry.util.CFLGraphBuilder;
import jry.util.CFLLib;
import jry.util.CallGraphGenerator;
import jry.util.ResultOperator;
import soot.*;
import soot.jimple.*;
import soot.toolkits.scalar.ArraySparseSet;
import soot.util.Chain;
import soot.util.queue.QueueReader;
import vasco.callgraph.CallGraphTransformer;

import java.io.File;
import java.util.*;

public class FlowFieldCFLTransformer extends LogPTATransformer {
    Map<Integer, ArraySparseSet<Integer>> result = new TreeMap<>();
    Map<Integer, Local> queries = new TreeMap<>();
    CFLGraphBuilder graphBuilder = new CFLGraphBuilder();
    Set<SootMethod> isVisit = new HashSet<>();
    Map<SootMethod, Set<SootField>> staticFields = new HashMap<SootMethod, Set<SootField>>();


    @Override
    public Map<Integer, ArraySparseSet<Integer>> getResult() {
        return result;
    }

    private Object getValue(Value var) {
        if (var instanceof ArrayRef) {
            return ((ArrayRef) var).getBase();
        } else if (var instanceof StaticFieldRef) {
            return ((StaticFieldRef) var).getField();
        }
        return var;
    }

    void resolveStaticFieldInCall(SootMethod sMethod, InvokeExpr ie) {

    }

    void collectAllStaticField(SootMethod sMethod, Set<SootField> fields) {
        if (sMethod.hasActiveBody()) {
            for (Unit unit : sMethod.getActiveBody().getUnits()) {
                if (unit instanceof InvokeStmt) {
                    InvokeExpr ie = ((InvokeStmt) unit).getInvokeExpr();
                    if (ie.getMethod().toString().equals("<benchmark.internal.BenchmarkN: void alloc(int)>")) {
                        continue;
                    } else if (ie.getMethod().toString().equals("<benchmark.internal.BenchmarkN: void test(int,java.lang.Object)>")) {
                        continue;
                    } else {
                        List<SootMethod> nextMethods = CallGraphGenerator.resolveTarget(unit);
                        for (SootMethod nextMethod : nextMethods) {
                            resolveStaticFieldInCall(nextMethod, ie);
                            collectAllStaticField(nextMethod, fields);
                        }
                    }
                } else if (unit instanceof DefinitionStmt) {
                    Object right = getValue(((DefinitionStmt) unit).getRightOp());
                    Object left = getValue(((DefinitionStmt) unit).getLeftOp());
                    if (left instanceof SootField) {
                        fields.add((SootField)left);
                    }
                    if (right instanceof SootField) {
                        fields.add((SootField)right);
                    } else if (right instanceof InvokeExpr) {
                        InvokeExpr ie = (InvokeExpr)right;
                        List<SootMethod> nextMethods = CallGraphGenerator.resolveTarget(unit);
                        for (SootMethod nextMethod : nextMethods) {
                            resolveStaticFieldInCall(nextMethod, ie);
                            collectAllStaticField(nextMethod, fields);
                        }

                    }
                }
            }
        }
    }

    void dfsMethod(SootMethod sMethod) {

    }

    @Override
    protected void myInternalTransform(String s, Map<String, String> map) {
        SootMethod mainMethod = Scene.v().getMainMethod();

        // get all static Filed
        QueueReader<MethodOrMethodContext> allMethods = Scene.v().getReachableMethods().listener();
        while (allMethods.hasNext()) {
            SootMethod currentMethod = allMethods.next().method();
            isVisit.clear();
            Set<SootField> currentFields = new HashSet<SootField>();
            collectAllStaticField(currentMethod, currentFields);
        }

        // build graph
        isVisit.clear();
        dfsMethod(mainMethod);

        graphBuilder.doAnalysis(CFLLib.FieldCFL, CFLLib.FieldCFLName);
        for (Map.Entry<Integer, Local> entry : queries.entrySet()) {
            result.put(entry.getKey(), graphBuilder.getPointTo(entry.getValue(), -2));
        }
    }

    public static void main(String[] args) {
        FlowFieldCFLTransformer ipat = new FlowFieldCFLTransformer();
        PackManager.v().getPack("wjtp").add(new Transform("wjtp.fcpa", new CallGraphTransformer()));
        PackManager.v().getPack("wjtp").add(new Transform("wjtp.ffpta", ipat));
        String dir = "code/src";
        String classpath = dir
                + File.pathSeparator + dir + File.separator + "rt.jar"
                + File.pathSeparator + dir + File.separator + "jce.jar";
        System.out.println(classpath);
        String className = "LocalTest";

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
