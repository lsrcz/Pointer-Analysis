package Anderson;

import jry.evaluation.AbstractPTATransformer;
import jry.evaluation.LogPTATransformer;
import jry.util.FileIO;
import jry.util.ResultOperator;
import soot.Main;
import soot.PackManager;
import soot.Transform;
import soot.Unit;
import soot.jimple.AnyNewExpr;
import soot.jimple.NewExpr;
import soot.toolkits.scalar.ArraySparseSet;
import soot.toolkits.scalar.FlowSet;
import utils.AnswerPrinter;
import utils.DataFlowSolutionToResultOperator;
import vasco.DataFlowSolution;
import vasco.callgraph.CallGraphTransformer;

import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InterProcedureFieldAndersonMemFixTrans extends LogPTATransformer {
    private InterProcedureFieldAndersonMemFix analysis;
    private DataFlowSolutionToResultOperator solutionToResultOp;
    private Map<Integer, ArraySparseSet<Integer>> result;

    public Map<Integer, ArraySparseSet<Integer>> getResult() {
        return result;
    }

    Map<Integer, ArraySparseSet<Integer>> getGroundTruth(String filename) {
        List<String> lines = FileIO.readLines(filename);
        Map<Integer, ArraySparseSet<Integer>> result = new HashMap<Integer, ArraySparseSet<Integer>>();
        for (String line : lines) {
            String[] words = line.split(":? ");
            // assert words.length > 1;
            int queryID;
            if (words[0].endsWith(":"))
                queryID = Integer.parseInt(words[0].substring(0, words[0].length() - 1));
            else
                queryID =  Integer.parseInt(words[0]);

            ArraySparseSet<Integer> currentRes = new ArraySparseSet<>();
            for (int i = 1; i < words.length; ++i) {
                currentRes.add(Integer.parseInt(words[i]));
            }
            result.put(queryID, currentRes);
        }
        // System.out.println(result);
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
        try {
            Map<Integer, ArraySparseSet<Integer>> mm = getGroundTruth("result.txt");
            resultOp.Intersect(mm);
            AnswerPrinter.printAnswer(resultOp.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
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
