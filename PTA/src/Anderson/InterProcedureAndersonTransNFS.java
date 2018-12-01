package Anderson;

import jry.util.ResultOperator;
import soot.*;
import soot.jimple.NewExpr;
import soot.toolkits.scalar.FlowSet;
import utils.DataFlowSolutionToResultOperator;
import vasco.DataFlowSolution;
import vasco.callgraph.CallGraphTransformer;

import java.io.File;
import java.util.Map;

public class InterProcedureAndersonTransNFS extends SceneTransformer {
    private InterProcedureAndersonNFS analysis;

    @Override
    protected void internalTransform(String s, Map<String, String> map) {
        analysis = new InterProcedureAndersonNFS();
        DataFlowSolutionToResultOperator converter = new DataFlowSolutionToResultOperator();
        analysis.doAnalysis();
        //DataFlowSolution<Unit, Map<Local, FlowSet<NewExpr>>> solution = analysis.getMeetOverValidPathsSolution();
        //ResultOperator ro = converter.convertLocal(solution);
        //System.out.println(ro);
    }

    public static void main(String args[]) {
        InterProcedureAndersonTransNFS ipat = new InterProcedureAndersonTransNFS();
        PackManager.v().getPack("wjtp").add(new Transform("wjtp.fcpa", new CallGraphTransformer()));
        PackManager.v().getPack("wjtp").add(new Transform("wjtp.ipa", ipat));
        String dir = "./resources";
        String classpath = dir
                + File.pathSeparator + dir + File.separator + "rt.jar"
                + File.pathSeparator + dir + File.separator + "jce.jar";
        System.out.println(classpath);
        String className = "dataset.Test2";

        Main.main(new String[]{
                "-w",
                "-app", "-pp",
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
    }
}
