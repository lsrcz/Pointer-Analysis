package basic;

import jry.util.ResultOperator;
import soot.*;
import soot.jimple.*;
import soot.jimple.toolkits.callgraph.ReachableMethods;
import soot.toolkits.scalar.ArraySparseSet;
import soot.util.queue.QueueReader;
import utils.AnswerPrinter;
import jry.evaluation.AbstractPTATransformer;
import jry.evaluation.LogPTATransformer;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

public class BasicProgramTransformer extends LogPTATransformer {
    private Map<Integer, ArraySparseSet<Integer>> result = new TreeMap<>();
    public Map<Integer, ArraySparseSet<Integer>> getResult() {
        return result;
    }

    @Override
    protected void myInternalTransform(String s, Map<String, String> map) {
        TreeMap<Integer, Local> queries = new TreeMap<>();
        ReachableMethods reachableMethods = Scene.v().getReachableMethods();
        QueueReader<MethodOrMethodContext> queueReader = reachableMethods.listener();
        TreeSet<Integer> allocs = new TreeSet<>();
        while (queueReader.hasNext()) {
            SootMethod sMethod = queueReader.next().method();
            int allocId = 0;
            if (sMethod.hasActiveBody()) {
                for (Unit current: sMethod.getActiveBody().getUnits()) {
                    if (current instanceof InvokeStmt) {
                        InvokeExpr expr = ((InvokeStmt) current).getInvokeExpr();
                        if (expr.getMethod().toString().equals("<benchmark.internal.Benchmark: void alloc(int)>")){
                            allocId = ((IntConstant)expr.getArg(0)).value;
                        }
                        if (expr.getMethod().toString().equals("<benchmark.internal.Benchmark: void test(int,java.lang.Object)>")){
                            Local var = (Local) expr.getArg(1);
                            int queryId = ((IntConstant)expr.getArg(0)).value;
                            queries.put(queryId, var);
                        }
                    }
                    if ((current instanceof DefinitionStmt) && ((((DefinitionStmt) current).getRightOp() instanceof NewExpr) ||
                            (((DefinitionStmt) current).getRightOp() instanceof NewArrayExpr) ||
                            (((DefinitionStmt) current).getRightOp() instanceof NewMultiArrayExpr))) {
                        allocs.add(allocId);
                        allocId = 0;
                    }
                }
            }
        }

        for (Map.Entry<Integer, Local> entry : queries.entrySet()) {
            result.put(entry.getKey(), new ArraySparseSet<>());
            ArraySparseSet<Integer> set = result.get(entry.getKey());
            for (Integer x : allocs) {
                set.add(x);
            }
        }

        ResultOperator resultOp = new ResultOperator(result);
        AnswerPrinter.printAnswer(resultOp.toString());

        /*
        String allAllocs = "";
        Iterator<Integer> iterator = allocs.iterator();
        while (iterator.hasNext()) {
            int currentId = iterator.next();
            allAllocs += " " + currentId;
        }

        String answer = "";
        for (Map.Entry<Integer, Local> entry: queries.entrySet()) {
            answer += entry.getKey() + " " + allAllocs + "\n";
        }
        AnswerPrinter.printAnswer(answer);
        */
    }
}
