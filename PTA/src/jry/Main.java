package jry;

import jry.basicfieldCFL.BasicFieldCFLTreansformer;
import soot.PackManager;
import soot.Transform;
import vasco.callgraph.CallGraphTransformer;

import java.io.File;

public class Main {

    public static void main(String[] args) {
        String dir = "code/src";
        String className = "LocalTest";
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
        PackManager.v().getPack("wjtp").add(new Transform("wjtp.mypta", new BasicFieldCFLTreansformer()));
        soot.Main.main(sootArgs);
    }
}