package jry;

import jry.basicfieldCFL.BasicFieldCFLTransformer;
import jry.evaluation.RunDataset;
import jry.util.ResultOperator;
import soot.PackManager;
import soot.Transform;
import vasco.callgraph.CallGraphTransformer;

import java.io.File;

public class Main {

    public static void main(String[] args) {
        /*String dir = "resources";
        String className = "dataset.Test8";
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
                "-main-class", className,
                "-f", "none", className
        };
        System.out.println(classPath);
        PackManager.v().getPack("wjtp").add(new Transform("wjtp.fcpa", new CallGraphTransformer()));
        BasicFieldCFLTransformer fCFL = new BasicFieldCFLTransformer();
        PackManager.v().getPack("wjtp").add(new Transform("wjtp.mypta", fCFL));
        soot.Main.main(sootArgs);
        ResultOperator result = new ResultOperator(fCFL.result);
        System.out.println(result);*/
        RunDataset datasetRunner = new RunDataset();
        datasetRunner.testAllTransformerWithAllData();
    }
}
