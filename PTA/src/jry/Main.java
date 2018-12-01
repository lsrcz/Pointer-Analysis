package jry;

import basic.BasicProgramTransformer;
import jry.basicfieldCFL.BasicFieldCFLTransformer;
import jry.clonefieldCFL.CloneFieldCFLTransformer;
import jry.contextfieldCFL.ContextFieldCFLTransformer;
import jry.evaluation.AbstractPTATransformer;
import jry.evaluation.RunDataset;
import jry.util.ResultOperator;
import soot.PackManager;
import soot.Transform;
import vasco.callgraph.CallGraphTransformer;

import java.io.File;
import java.util.ArrayList;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        /*String dir = "resources";
        String className = "dataset.Test58";
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
       // BasicProgramTransformer fCFL = new BasicProgramTransformer();
        ContextFieldCFLTransformer fCFL = new ContextFieldCFLTransformer();
        PackManager.v().getPack("wjtp").add(new Transform("wjtp.mypta", fCFL));
        soot.Main.main(sootArgs);
        ResultOperator result = new ResultOperator(fCFL.getResult());
        System.out.println(result);*/

        ArrayList<Class<? extends AbstractPTATransformer>> allList = new ArrayList<>();
        allList.add(BasicProgramTransformer.class);
        allList.add(ContextFieldCFLTransformer.class);
        RunDataset datasetRunner = new RunDataset(allList);
        datasetRunner.testAllTransformerWithAllData(12, 58);
    }
}
