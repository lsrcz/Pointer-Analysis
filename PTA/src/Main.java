import java.io.*;
import java.util.*;
import java.util.concurrent.*;

import Anderson.InterProcedureFieldAndersonMemFixTrans;
import jry.evaluation.AbstractPTATransformer;
import jry.util.ResultOperator;

import soot.PackManager;
import soot.Transform;
import soot.toolkits.scalar.ArraySparseSet;
import vasco.VascoClearer;
import vasco.callgraph.CallGraphTransformer;

public class Main {
    static AbstractPTATransformer trans[] = {new InterProcedureFieldAndersonMemFixTrans()};
    static ExecutorService executor = Executors.newFixedThreadPool(4);
    static String dir, className;

    static void printAnswer(String answer) {
        try {
            PrintStream ps = new PrintStream(
                    new FileOutputStream(new File("result.txt")));
            ps.println(answer);
            ps.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    static void optimizeProgram(String[] args) {
        String classpath = dir
                + File.pathSeparator + dir + File.separator + "rt.jar"
                + File.pathSeparator + dir + File.separator + "jce.jar";
        System.out.println(classpath);
        //String className = args[1];

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
    }

    static Future<Map<Integer, ArraySparseSet<Integer>>> getFuture(int i) {
        Future<Map<Integer, ArraySparseSet<Integer>>> future = executor.submit(new Callable<Map<Integer, ArraySparseSet<Integer>>>() {
            public Map<Integer, ArraySparseSet<Integer>> call() throws Exception {
                AbstractPTATransformer ipat = trans[i];
                String optimized = "./sootOutput";
                String classpath = optimized
                        + File.pathSeparator + dir + File.separator + "rt.jar"
                        + File.pathSeparator + dir + File.separator + "jce.jar";
                PackManager.v().getPack("wjtp").add(new Transform("wjtp.fcpa", new CallGraphTransformer()));
                PackManager.v().getPack("wjtp").add(new Transform("wjtp.ipa", ipat));
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
                return ipat.getResult();
            }
        });
        return future;
    }

    public static void main(String[] args) {
        //dir = args[0];
        dir = "./resources";
        //className = args[1];
        className = "dataset.Test60";
        optimizeProgram(args);
        ArrayList<Future<Map<Integer, ArraySparseSet<Integer>>>> futures = new ArrayList<>();
        for (int i = 0; i < trans.length; i++) {
            futures.add(getFuture(i));
        }
        ResultOperator resultOp = null;
        while (true) {
            System.out.println("Waiting");
            boolean updated = false;
            int finished = 0;
            for (int i = 0; i < trans.length; i++) {
                Future<Map<Integer, ArraySparseSet<Integer>>> future = futures.get(i);
                if (future.isDone() && !future.isCancelled()) {
                    try {
                        Map<Integer, ArraySparseSet<Integer>> x = future.get();
                        if (resultOp == null) {
                            resultOp = new ResultOperator(x);
                        } else {
                            resultOp.Intersect(x);
                        }
                        updated = true;
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    finished += 1;
                }
            }
            if (updated) {
                printAnswer(resultOp.toString());
            }
            if (finished == trans.length) {
                System.out.println("Exit");
                break;
            }
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        executor.shutdown();
    }
}
