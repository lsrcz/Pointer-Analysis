package basic;

import soot.*;
import soot.jimple.*;
import soot.util.*;
import soot.jimple.toolkits.callgraph.ReachableMethods;
import soot.util.queue.QueueReader;
import utils.AnswerPrinter;

import java.util.*;
import java.util.Map.Entry;
import javafx.util.*;
import java.io.*;

public class FieldSensitiveTransformer extends SceneTransformer {
    @Override
    protected void internalTransform(String s, Map<String, String> map) {
        Map<Type, List<SootField>> classSlots = new TreeMap<Type, List<SootField>>();
        Map<Type, List<SootField>> classPointers = new TreeMap<Type, List<SootField>>();
        Chain<SootClass> classes = Scene.v().getClasses();
        for (SootClass c : classes) {
            Type type = c.getType();
            if (!classSlots.containsKey(type)) {
                classSlots.put(type, new ArrayList<SootField>());
                classPointers.put(type, new ArrayList<SootField>());
            }
            Chain<SootField> fields = c.getFields();
            for (SootField field : fields) {
                Type t = field.getType();
                classSlots.get(type).add(field);
                if (t instanceof RefType) {
                    classPointers.get(type).add(field);
                }
            }
        }
        /*
        for (Map.Entry<String, List<SootField>> entry : classPointers.entrySet()) {
            System.out.println("Class: " + entry.getKey());
            for (SootField f : entry.getValue()) {
                System.out.print(f.getName() + " ");
            }
            System.out.println("");
        }
        */

        TreeMap<Integer, Local> queries = new TreeMap<>();
        Anderson anderson = new Anderson();
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
                    if (current instanceof DefinitionStmt) {
                        if (((DefinitionStmt)current).getRightOp() instanceof NewExpr) {
                            anderson.addNewConstraint(allocId, (Object)((DefinitionStmt)current).getLeftOp());
                            /*
                            Type t = ((DefinitionStmt)current).getRightOp().getType();
                            if (t instanceof RefType) {
                                if (classSlots.containsKey(t)) {
                                    List<SootField> l = classSlots.get(t);
                                    for (SootField x : l) {
                                        anderson.addNewConstraint(0, (Object)new Pair<Integer, SootField>(allocId, x));
                                    }
                                }
                            }
                            */
                            allocId = 0;
                        }
                        if (((DefinitionStmt)current).getLeftOp() instanceof Local && ((DefinitionStmt)current).getRightOp() instanceof Local) {
                            anderson.addAssignConstraint((Object) ((DefinitionStmt) current).getRightOp(), (Object) ((DefinitionStmt) current).getLeftOp());
                        }
                        if (((DefinitionStmt)current).getLeftOp() instanceof Local && ((DefinitionStmt)current).getRightOp() instanceof StaticFieldRef) {
                            anderson.addAssignConstraint((Object) ((DefinitionStmt) current).getRightOp(), (Object) ((DefinitionStmt) current).getLeftOp());
                        }
                        if (((DefinitionStmt)current).getLeftOp() instanceof StaticFieldRef && ((DefinitionStmt)current).getRightOp() instanceof Local) {
                            anderson.addAssignConstraint((Object) ((DefinitionStmt) current).getRightOp(), (Object) ((DefinitionStmt) current).getLeftOp());
                        }
                        if (((DefinitionStmt)current).getLeftOp() instanceof StaticFieldRef && ((DefinitionStmt)current).getRightOp() instanceof StaticFieldRef) {
                            anderson.addAssignConstraint((Object) ((DefinitionStmt) current).getRightOp(), (Object) ((DefinitionStmt) current).getLeftOp());
                        }
                        if (((DefinitionStmt)current).getLeftOp() instanceof InstanceFieldRef && ((DefinitionStmt)current).getRightOp() instanceof Local) {
                            Value base = ((InstanceFieldRef)((DefinitionStmt)current).getLeftOp()).getBase();
                            SootField field = ((InstanceFieldRef)((DefinitionStmt)current).getLeftOp()).getField();
                            if (base instanceof Local) {
                                anderson.addInstanceAssignConstraint((Object) base, (Object) ((DefinitionStmt) current).getRightOp(), field);
                            }
                        }
                        if (((DefinitionStmt)current).getLeftOp() instanceof Local && ((DefinitionStmt)current).getRightOp() instanceof InstanceFieldRef) {
                            Value base = ((InstanceFieldRef)((DefinitionStmt)current).getRightOp()).getBase();
                            SootField field = ((InstanceFieldRef)((DefinitionStmt)current).getRightOp()).getField();
                            if (base instanceof Local) {
                                anderson.addAssignInstanceConstraint((Object) ((DefinitionStmt) current).getLeftOp(), (Object) base, field);
                            }
                        }
                        if (((DefinitionStmt)current).getLeftOp() instanceof InstanceFieldRef && ((DefinitionStmt)current).getRightOp() instanceof InstanceFieldRef) {
                            Value baseL = ((InstanceFieldRef)((DefinitionStmt)current).getLeftOp()).getBase();
                            SootField fieldL = ((InstanceFieldRef)((DefinitionStmt)current).getLeftOp()).getField();
                            Value baseR = ((InstanceFieldRef)((DefinitionStmt)current).getRightOp()).getBase();
                            SootField fieldR = ((InstanceFieldRef)((DefinitionStmt)current).getRightOp()).getField();
                            if (baseL instanceof Local && baseR instanceof Local) {
                                anderson.addInstanceAssignInstanceConstraint(baseL, baseR, fieldL, fieldR);
                            }
                        }
                    }
                }
            }
        }

        anderson.run();
        String answer = "";
        for (Entry<Integer, Local> q : queries.entrySet()) {
            TreeSet<Integer> result = anderson.getPointsToSet(q.getValue());
            answer += q.getKey().toString() + ":";
            for (Integer i : result) {
                answer += " " + i;
            }
            answer += "\n";
        }

        AnswerPrinter.printAnswer(answer);
    }
}