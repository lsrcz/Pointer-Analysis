package utils;

import jry.util.ResultOperator;
import soot.*;
import soot.jimple.*;
import soot.jimple.toolkits.callgraph.ReachableMethods;
import soot.toolkits.scalar.ArraySparseSet;
import soot.toolkits.scalar.FlowSet;
import soot.toolkits.scalar.Pair;
import soot.util.queue.QueueReader;
import vasco.DataFlowSolution;

import javax.xml.transform.Result;
import java.util.HashMap;
import java.util.Map;

public class DataFlowSolutionToResultOperator {
    private Map<InvokeStmt, Pair<Local, Integer>> queries;
    private Map<AnyNewExpr, Integer> allocs;

    public DataFlowSolutionToResultOperator() {
        queries = new HashMap<>();
        allocs = new HashMap<>();
        ReachableMethods reachableMethods = Scene.v().getReachableMethods();
        QueueReader<MethodOrMethodContext> qr = reachableMethods.listener();
        int allocID = 0;
        while (qr.hasNext()) {
            SootMethod sm = qr.next().method();
            if (sm.hasActiveBody()) {
                for (Unit u: sm.getActiveBody().getUnits()) {
                    if (u instanceof InvokeStmt) {
                        InvokeExpr ie = ((InvokeStmt) u).getInvokeExpr();
                        if (ie.getMethod().toString().equals("<benchmark.internal.BenchmarkN: void alloc(int)>")) {
                            allocID = ((IntConstant)ie.getArgs().get(0)).value;
                        }
                        if (ie.getMethod().toString().equals("<benchmark.internal.BenchmarkN: void test(int,java.lang.Object)>")) {
                            int id = ((IntConstant)ie.getArgs().get(0)).value;
                            queries.put((InvokeStmt)u, new Pair<>((Local)ie.getArgs().get(1), id));
                        }
                    }
                    if (u instanceof DefinitionStmt) {
                        if (((DefinitionStmt)u).getRightOp() instanceof AnyNewExpr) {
                            allocs.put((AnyNewExpr)((DefinitionStmt)u).getRightOp(), allocID);
                            allocID = 0;
                        }
                    }
                }
            }
        }
    }

    public ResultOperator convert(DataFlowSolution<Unit, Map<Object, FlowSet<AnyNewExpr>>> dfs) {
        Map<Integer, ArraySparseSet<Integer>> set = new HashMap<>();
        for (InvokeStmt is: queries.keySet()) {
            Map<Object, FlowSet<AnyNewExpr>> r = dfs.getValueAfter(is);
            Pair<Local, Integer> p = queries.get(is);
            FlowSet<AnyNewExpr> s = r.get(p.getO1());
            if (s == null) {
                set.put(p.getO2(), new ArraySparseSet<>());
            } else {
                ArraySparseSet<Integer> iset = new ArraySparseSet<>();
                for (AnyNewExpr expr : s) {
                    iset.add(allocs.get(expr));
                }
                set.put(p.getO2(), iset);
            }
        }
        return new ResultOperator(set);
    }

    public ResultOperator convertLocal(DataFlowSolution<Unit, Map<Local, FlowSet<AnyNewExpr>>> dfs) {
        Map<Integer, ArraySparseSet<Integer>> set = new HashMap<>();
        for (InvokeStmt is: queries.keySet()) {
            Map<Local, FlowSet<AnyNewExpr>> r = dfs.getValueAfter(is);
            Pair<Local, Integer> p = queries.get(is);
            FlowSet<AnyNewExpr> s = r.get(p.getO1());
            ArraySparseSet<Integer> iset = new ArraySparseSet<>();
            for (AnyNewExpr expr: s) {
                iset.add(allocs.get(expr));
            }
            set.put(p.getO2(), iset);
        }
        return new ResultOperator(set);
    }

}
