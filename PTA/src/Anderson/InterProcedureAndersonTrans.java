package Anderson;

import jry.evaluation.LogPTATransformer;
import jry.util.ResultOperator;
import jry.evaluation.AbstractPTATransformer;
import soot.*;
import soot.jimple.NewExpr;
import soot.toolkits.scalar.ArraySparseSet;
import soot.toolkits.scalar.FlowSet;
import utils.DataFlowSolutionToResultOperator;
import vasco.DataFlowSolution;
import vasco.VascoClearer;
import vasco.callgraph.CallGraphTransformer;

import java.io.File;
import java.util.Map;
import jry.util.*;

public class InterProcedureAndersonTrans extends LogPTATransformer {
    private InterProcedureFieldAnderson analysis;
    private DataFlowSolutionToResultOperator solutionToResultOp;
    private Map<Integer, ArraySparseSet<Integer>> result;

    public Map<Integer, ArraySparseSet<Integer>> getResult() {
        return result;
    }

    @Override
    protected void myInternalTransform(String s, Map<String, String> map) {
        solutionToResultOp = new DataFlowSolutionToResultOperator();
        analysis = new InterProcedureFieldAnderson();
        analysis.doAnalysis();
        DataFlowSolution<Unit, Map<Object, FlowSet<NewExpr>>> solution = analysis.getMeetOverValidPathsSolution();
        //ResultOperator resultOp = solutionToResultOp.convert(solution);
       // result = resultOp.getResult();
        //System.out.println(resultOp.toString());
    }

    public static void main(String args[]) {
        InterProcedureAndersonTrans ipat = new InterProcedureAndersonTrans();
        String dir = "./resources";
        String classpath = dir
                + File.pathSeparator + dir + File.separator + "rt.jar"
                + File.pathSeparator + dir + File.separator + "jce.jar";
        System.out.println(classpath);
        String className = "dataset.Test60";

        soot.Main.main(new String[]{
                "-W",
                "-O",
                "-soot-class-path", classpath,
                "-main-class", className,
                "-f", "J",
                className
        });
        soot.G.reset();
        VascoClearer.clear();
        PackManager.v().getPack("wjtp").add(new Transform("wjtp.fcpa", new CallGraphTransformer()));
        PackManager.v().getPack("wjtp").add(new Transform("wjtp.ipa", ipat));
        String optimized = "./sootOutput";
        classpath = optimized
                + File.pathSeparator + dir + File.separator + "rt.jar"
                + File.pathSeparator + dir + File.separator + "jce.jar";
        soot.Main.main(new String[]{
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
