package Anderson;

import jry.evaluation.AbstractPTATransformer;
import jry.evaluation.LogPTATransformer;
import jry.util.ResultOperator;
import soot.Main;
import soot.PackManager;
import soot.Transform;
import soot.Unit;
import soot.jimple.AnyNewExpr;
import soot.jimple.NewExpr;
import soot.toolkits.scalar.ArraySparseSet;
import soot.toolkits.scalar.FlowSet;
import utils.DataFlowSolutionToResultOperator;
import vasco.DataFlowSolution;
import vasco.callgraph.CallGraphTransformer;

import java.io.File;
import java.util.Map;

public class InterProcedureFieldAndersonMemFixTrans extends LogPTATransformer {
    private InterProcedureFieldAndersonMemFix analysis;
    private DataFlowSolutionToResultOperator solutionToResultOp;
    private Map<Integer, ArraySparseSet<Integer>> result;

    public Map<Integer, ArraySparseSet<Integer>> getResult() {
        return result;
    }

    @Override
    protected void myInternalTransform(String s, Map<String, String> map) {
        solutionToResultOp = new DataFlowSolutionToResultOperator();
        analysis = new InterProcedureFieldAndersonMemFix();
        analysis.doAnalysis();
        DataFlowSolution<Unit, Map<Object, FlowSet<AnyNewExpr>>> solution = analysis.getMeetOverValidPathsSolution();
        ResultOperator resultOp = solutionToResultOp.convert(solution);
        result = resultOp.getResult();
        System.out.println(resultOp.toString());
    }

    public static void main(String args[]) {
        InterProcedureFieldAndersonMemFixTrans ipat = new InterProcedureFieldAndersonMemFixTrans();
        PackManager.v().getPack("wjtp").add(new Transform("wjtp.fcpa", new CallGraphTransformer()));
        PackManager.v().getPack("wjtp").add(new Transform("wjtp.ipa", ipat));
        String dir = "./resources";
        String classpath = dir
                + File.pathSeparator + dir + File.separator + "rt.jar"
                + File.pathSeparator + dir + File.separator + "jce.jar";
        System.out.println(classpath);
        String className = "test.HelloArray";

        Main.main(new String[]{
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
    }
}
