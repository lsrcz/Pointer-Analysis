package basic;

import java.io.File;

import soot.PackManager;
import soot.Transform;

public class PointsToAnalysis {
    public void run(String dir, String className) {
        String classpath = dir
                + File.pathSeparator + dir + File.separator + "rt.jar"
                + File.pathSeparator + dir + File.separator + "jce.jar";
        System.out.println(classpath);
        PackManager.v().getPack("wjtp").add(new Transform("wjtp.mypta", new BasicProgramTransformer()));
        soot.Main.main(new String[] {
                "-w",
                "-p", "cg.spark", "enabled:true",
                "-p", "wjtp.mypta", "enabled:true",
                "-soot-class-path", classpath,
                className
        });

    }
}
