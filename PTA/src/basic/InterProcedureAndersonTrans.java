package basic;

import soot.*;
import soot.jimple.NewExpr;
import soot.toolkits.scalar.FlowSet;
import vasco.DataFlowSolution;
import vasco.callgraph.CallGraphTransformer;

import java.io.File;
import java.util.Map;

public class InterProcedureAndersonTrans extends SceneTransformer {
    private InterProcedureAnderson analysis;

    @Override
    protected void internalTransform(String s, Map<String, String> map) {
        analysis = new InterProcedureAnderson();
        analysis.doAnalysis();
        DataFlowSolution<Unit, Map<Local, FlowSet<NewExpr>>> solution = analysis.getMeetOverValidPathsSolution();
        int i = 0;
    }

    public static void main(String args[]) {
        InterProcedureAndersonTrans ipat = new InterProcedureAndersonTrans();
        PackManager.v().getPack("wjtp").add(new Transform("wjtp.fcpa", new CallGraphTransformer()));
        PackManager.v().getPack("wjtp").add(new Transform("wjtp.ipa", ipat));
        String dir = "../dataset/code";
        String classpath = dir
                + File.pathSeparator + dir + File.separator + "rt.jar"
                + File.pathSeparator + dir + File.separator + "jce.jar";
        System.out.println(classpath);
        String className = "test.InterFlow";

        soot.Main.main(new String[]{
                "-w",
                //"-p", "cg.spark", "enabled:true",
                "-p", "wjtp.fcpa", "enabled:true",
                "-p", "wjtp.ipa", "enabled:true",
                "-soot-class-path", classpath,
                "-f", "J",
                className
        });
    }
}
