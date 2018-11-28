package basic;

import soot.*;
import soot.jimple.*;
import soot.jimple.toolkits.callgraph.ReachableMethods;
import soot.util.queue.QueueReader;
import utils.AnswerPrinter;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

public class BasicProgramTransformer extends SceneTransformer {
    @Override
    protected void internalTransform(String s, Map<String, String> map) {
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
                    if ((current instanceof DefinitionStmt) && (((DefinitionStmt) current).getRightOp() instanceof NewExpr)) {
                        allocs.add(allocId);
                    }
                }
            }
        }
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
    }
}
