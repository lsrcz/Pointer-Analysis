package jry;

import basic.BasicProgramTransformer;
import basic.PointsToAnalysis;
import soot.*;
import soot.jimple.toolkits.callgraph.Edge;
import soot.jimple.toolkits.callgraph.ReachableMethods;
import soot.util.queue.QueueReader;
import vasco.callgraph.CallGraphTransformer;

import java.io.File;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

class CallGraphPrinter extends SceneTransformer {
    private List<SootMethod> resolveTargets(SootMethod sMethod, Unit unit) {
        List<SootMethod> targets = new LinkedList<>();
        Iterator iterator = Scene.v().getCallGraph().edgesOutOf(unit);
        while (iterator.hasNext()) {
            Edge edge = (Edge)iterator.next();
            if (edge.isExplicit()) {
                targets.add(edge.tgt());
            }
        }
        return targets;
    }

    private void printCallGraph(SootMethod sMethod, Unit unit, List<SootMethod> targets) {
        System.out.println("\n--------------------");
        System.out.println("Current Method: " + sMethod.toString());
        System.out.println("Current Unit: " + unit.toString());
        for (SootMethod targetMethod : targets) {
            System.out.println("    " + targetMethod.toString());
        }
    }

    @Override
    protected void internalTransform(String s, Map<String, String> map) {
        ReachableMethods allMethods = Scene.v().getReachableMethods();
        QueueReader<MethodOrMethodContext> qReader = allMethods.listener();
        while (qReader.hasNext()) {
            SootMethod sMethod = qReader.next().method();
            if (sMethod.hasActiveBody()) {
                for (Unit unit : sMethod.getActiveBody().getUnits()) {
                    List<SootMethod> targets = resolveTargets(sMethod, unit);
                    if (!targets.isEmpty()) {
                        printCallGraph(sMethod, unit, targets);
                    }
                }
            }
        }
    }
}

public class CallGraph {
    public void printGraph(String dir, String className) {
        String classPath = dir
                + File.pathSeparator + dir + File.separator + "rt.jar"
                + File.pathSeparator + dir + File.separator + "jce.jar";
        String[] sootArgs = {
                "-cp", classPath, "-pp",
                "-w", "-app",
                "-keep-line-number",
                "-keep-bytecode-offset",
                "-p", "cg", "implicit-entry:false",
                "-p", "cg.spark", "enabled",
                "-p", "cg.spark", "simulate-natives",
                "-p", "cg", "safe-forname",
                "-p", "cg", "safe-newinstance",
                "-main-class", className,
                "-f", "none", className
        };
        System.out.println(classPath);
        PackManager.v().getPack("wjtp").add(new Transform("wjtp.fcpa", new CallGraphTransformer()));
        PackManager.v().getPack("wjtp").add(new Transform("wjtp.mypta", new CallGraphPrinter()));
        soot.Main.main(sootArgs);
    }
}
