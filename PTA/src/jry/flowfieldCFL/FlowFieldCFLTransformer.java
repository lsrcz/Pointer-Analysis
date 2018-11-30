package jry.flowfieldCFL;

import jry.clonefieldCFL.CloneFieldCFLTransformer;
import jry.evaluation.LogPTATransformer;
import jry.util.CFLGraphBuilder;
import jry.util.CFLLib;
import jry.util.ResultOperator;
import soot.*;
import soot.toolkits.scalar.ArraySparseSet;
import soot.util.Chain;
import vasco.callgraph.CallGraphTransformer;

import java.io.File;
import java.util.*;

public class FlowFieldCFLTransformer extends LogPTATransformer {
    Map<Integer, ArraySparseSet<Integer>> result = new TreeMap<>();
    Map<Integer, Local> queries = new TreeMap<>();
    CFLGraphBuilder graphBuilder = new CFLGraphBuilder();
    Set<SootField> staticFields = new HashSet<>();


    @Override
    public Map<Integer, ArraySparseSet<Integer>> getResult() {
        return result;
    }

    void collectAllStaticField(SootMethod sMethod) {

    }

    void dfsMethod(SootMethod sMethod) {

    }

    @Override
    protected void myInternalTransform(String s, Map<String, String> map) {
        SootMethod mainMethod = Scene.v().getMainMethod();
        collectAllStaticField(mainMethod);
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
