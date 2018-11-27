package jry.util;

import soot.*;
import soot.jimple.toolkits.callgraph.Edge;
import vasco.callgraph.CallGraphTransformer;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class CallGraphGenerator {
    public static void preCalc(){
        PackManager.v().getPack("wjtp").add(new Transform("wjtp.fcpa", new CallGraphTransformer()));
    }

    public static void printCallGraph(SootMethod sMethod, Unit unit, List<SootMethod> targets) {
        System.out.println("\n--------------------");
        System.out.println("Current Method: " + sMethod.toString());
        System.out.println("Current Unit: " + unit.toString());
        for (SootMethod targetMethod : targets) {
            System.out.println("    " + targetMethod.toString());
        }
    }

    public static List<SootMethod> resolveTarget(Unit unit) {
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
}
