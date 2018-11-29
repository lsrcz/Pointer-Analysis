package Anderson;

import soot.*;
import soot.jimple.NewExpr;
import soot.toolkits.scalar.FlowSet;
import utils.DataFlowSolutionToResultOperator;
import vasco.DataFlowSolution;
import vasco.callgraph.CallGraphTransformer;

import java.io.File;
import java.util.Map;
import jry.util.*;

public class InterProcedureAndersonTrans extends SceneTransformer {
    private InterProcedureFieldAnderson analysis;
    private DataFlowSolutionToResultOperator solutionToResultOp;

    @Override
    protected void internalTransform(String s, Map<String, String> map) {
        solutionToResultOp = new DataFlowSolutionToResultOperator();
        analysis = new InterProcedureFieldAnderson();
        analysis.doAnalysis();
        DataFlowSolution<Unit, Map<Object, FlowSet<NewExpr>>> solution = analysis.getMeetOverValidPathsSolution();
        ResultOperator resultOp = solutionToResultOp.convert(solution);
        System.out.println(resultOp.toString());
    }

    public static void main(String args[]) {
        InterProcedureAndersonTrans ipat = new InterProcedureAndersonTrans();
        PackManager.v().getPack("wjtp").add(new Transform("wjtp.fcpa", new CallGraphTransformer()));
        PackManager.v().getPack("wjtp").add(new Transform("wjtp.ipa", ipat));
        String dir = "./resources";
        String classpath = dir
                + File.pathSeparator + dir + File.separator + "rt.jar"
                + File.pathSeparator + dir + File.separator + "jce.jar";
        System.out.println(classpath);
        String className = "test.FieldSensitivity";

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
