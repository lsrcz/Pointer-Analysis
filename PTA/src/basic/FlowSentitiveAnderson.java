package basic;

import soot.*;
import soot.jimple.*;
import soot.toolkits.graph.ExceptionalUnitGraph;
import soot.toolkits.graph.UnitGraph;
import soot.toolkits.scalar.ArraySparseSet;
import soot.toolkits.scalar.FlowSet;
import soot.toolkits.scalar.ForwardFlowAnalysis;
import soot.util.Chain;

import java.io.File;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class FlowSentitiveAnderson extends ForwardFlowAnalysis<Unit, HashMap<Local, FlowSet<Integer>>> {
    private FlowSet<Local> allLocals;
    private HashMap<Local, Integer> allocIDs;

    public FlowSentitiveAnderson(Body b) {
        super(new ExceptionalUnitGraph(b));
        ExceptionalUnitGraph g = (ExceptionalUnitGraph)super.graph;

        Chain<Local> locs = g.getBody().getLocals();
        int allocID = -1;
        allocIDs = new HashMap<>();
        for (Unit u: g.getBody().getUnits()) {
            if (u instanceof InvokeStmt) {
                InvokeExpr expr = ((InvokeStmt)u).getInvokeExpr();
                if (expr.getMethod().toString().equals("<benchmark.internal.Benchmark: void alloc(int)>")) {
                    allocID = ((IntConstant) expr.getArg(0)).value;
                }
            } else if (u instanceof DefinitionStmt) {
                DefinitionStmt stmt = (DefinitionStmt)u;
                if (stmt.getLeftOp() instanceof Local)
                    allocIDs.put((Local)stmt.getLeftOp(), allocID);
            }
        }
        allLocals = new ArraySparseSet<>();
        for (Local x: locs) {
            allLocals.add(x);
        }
        doAnalysis();

        System.out.println(b.getMethod().getName());
        for (Unit u: unitToAfterFlow.keySet()) {
            if (u instanceof InvokeStmt) {
                InvokeExpr expr = ((InvokeStmt)u).getInvokeExpr();
                if (expr.getMethod().toString().equals("<benchmark.internal.Benchmark: void test(int,java.lang.Object)>")){
                    Local var = (Local) expr.getArg(1);
                    int queryId = ((IntConstant)expr.getArg(0)).value;
                    System.out.println(var.getName());
                    for (int t: unitToAfterFlow.get(u).get(var)) {
                        System.out.print(t);
                        System.out.print(" ");
                    }
                    System.out.println();
                }
            }
        }
    }
    protected HashMap<Local, FlowSet<Integer>> newInitialFlow() {
        HashMap<Local, FlowSet<Integer>> ret = new HashMap<>();
        for (Local x: allLocals) {
            ret.put(x, new ArraySparseSet<>());
        }
        return ret;
    }

    @Override
    protected void flowThrough(HashMap<Local, FlowSet<Integer>> localFlowSetHashMap, Unit unit, HashMap<Local, FlowSet<Integer>> a1) {
        for (Local x: localFlowSetHashMap.keySet()) {
            a1.put(x, new ArraySparseSet<>());
            localFlowSetHashMap.get(x).copy(a1.get(x));
        }
        if (unit instanceof AssignStmt) {
            AssignStmt stmt = (AssignStmt)unit;
            if (stmt.getLeftOp() instanceof Local) {
                Local lc = (Local) stmt.getLeftOp();
                if (stmt.getRightOp() instanceof NewExpr) {
                    a1.put(lc, new ArraySparseSet<>());
                    a1.get(lc).add(allocIDs.get(lc));
                    int i = 0;
                }
                if (stmt.getRightOp() instanceof Local) {
                    a1.get(lc).union(localFlowSetHashMap.get((Local) stmt.getRightOp()));
                    int i = 0;
                }
            }
        }

    }

    @Override
    protected void merge(HashMap<Local, FlowSet<Integer>> localFlowSetHashMap, HashMap<Local, FlowSet<Integer>> a1, HashMap<Local, FlowSet<Integer>> a2) {
        for (Local l: localFlowSetHashMap.keySet()) {
            localFlowSetHashMap.get(l).union(a1.get(l), a2.get(l));
        }
    }

    @Override
    protected void copy(HashMap<Local, FlowSet<Integer>> localFlowSetHashMap, HashMap<Local, FlowSet<Integer>> a1) {
        for (Local l: localFlowSetHashMap.keySet()) {
            localFlowSetHashMap.get(l).copy(a1.get(l));
        }
    }

    public static void main(String[] args) {
        PackManager.v().getPack("jtp").add (
                new Transform("jtp.fsa", new BodyTransformer() {
                    @Override
                    protected void internalTransform(Body body, String s, Map<String, String> map) {
                        new FlowSentitiveAnderson(body);
                    }
                })
        );
        String dir = "../dataset/code";
        String classpath = dir
                + File.pathSeparator + dir + File.separator + "rt.jar"
                + File.pathSeparator + dir + File.separator + "jce.jar";
        System.out.println(classpath);
        String className = "test.Hello";
        //soot.Main.main(new String[] {"--help"});
        soot.Main.main(new String[]{
                "-w",
                //"-p", "cg.spark", "enabled:true",
                "-p", "jtp.fsa", "enabled:true",
                "-soot-class-path", classpath,
                "-f", "J",
                className
        });
    }
}
