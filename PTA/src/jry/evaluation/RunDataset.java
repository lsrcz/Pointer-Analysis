package jry.evaluation;

import com.sun.org.apache.bcel.internal.generic.ARRAYLENGTH;
import jry.basicfieldCFL.BasicFieldCFLTransformer;
import jry.util.FileIO;
import jry.util.ResultOperator;
import soot.PackManager;
import soot.Transform;
import soot.toolkits.scalar.ArraySparseSet;
import vasco.VascoClearer;
import vasco.callgraph.CallGraphTransformer;

import java.io.File;
import java.lang.reflect.Array;
import java.util.*;

public class RunDataset {
    final int datasetSize = 30;
    ArrayList<Class<? extends AbstractPTATransformer>> allTransformer = new ArrayList<>();

    public RunDataset(){
        getAllTransformer();
    }

    public RunDataset(ArrayList<Class<? extends AbstractPTATransformer>> _allTransformer){
        allTransformer = _allTransformer;
    }

    Map<Integer, ArraySparseSet<Integer>> getGroundTruth(int testId) {
        List<String> lines = FileIO.readLines("resources/dataset/GroundTruth" + testId + ".txt");
        Map<Integer, ArraySparseSet<Integer>> result = new HashMap<Integer, ArraySparseSet<Integer>>();
        for (String line : lines) {
            String[] words = line.split(":? ");
            // assert words.length > 1;
            int queryId = Integer.parseInt(words[0]);
            ArraySparseSet<Integer> currentRes = new ArraySparseSet<>();
            for (int i = 1; i < words.length; ++i) {
                currentRes.add(Integer.parseInt(words[i]));
            }
            result.put(queryId, currentRes);
        }
        // System.out.println(result);
        return result;
    }

    String[] sootInit(String dir, String className) {
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
        soot.G.reset();
        VascoClearer.clear();
        return sootArgs;
    }

    Map<Integer, ArraySparseSet<Integer>> getResult(Class <? extends AbstractPTATransformer> PTAType, int testId) {
        String dir = "resources";
        String className = "dataset.Test" + testId;
        String[] args = sootInit(dir, className);
        PackManager.v().getPack("wjtp").add(new Transform("wjtp.fcpa", new CallGraphTransformer()));
        AbstractPTATransformer transformer = null;
        try {
            transformer = PTAType.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        PackManager.v().getPack("wjtp").add(new Transform("wjtp.mypta", transformer));
        soot.Main.main(args);
        PackManager.v().getPack("wjtp").remove("wjtp.fcpa");
        PackManager.v().getPack("wjtp").remove("wjtp.mypta");
        return transformer.getResult();
    }

    ArrayList<Map<Integer, ArraySparseSet<Integer>>> getResults(int testId) {

        String dir = "resources";
        String className = "dataset.Test" + testId;
        String[] args = sootInit(dir, className);

        PackManager.v().getPack("wjtp").add(new Transform("wjtp.fcpa", new CallGraphTransformer()));
        int id = 0;
        List<AbstractPTATransformer> transformers = new LinkedList<>();
        for (Class<? extends AbstractPTATransformer> type : allTransformer) {
            AbstractPTATransformer transformer = null;
            try {
                transformer = type.newInstance();
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
            transformers.add(transformer);
            PackManager.v().getPack("wjtp").add(new Transform("wjtp." + id + type.toString(), transformer));
            id += 1;
        }
        soot.Main.main(args);
        PackManager.v().getPack("wjtp").remove("wjtp.fcpa");
        id = 0;
        ArrayList<Map<Integer, ArraySparseSet<Integer>>> result = new ArrayList<>();
        for (AbstractPTATransformer transformer : transformers) {
            result.add(transformer.getResult());
            PackManager.v().getPack("wjtp").remove("wjtp." + id + transformer.getClass().toString());
            id += 1;
        }
        return result;
    }

    void getAllTransformer() {
        allTransformer.add(BasicFieldCFLTransformer.class);
    }

    Integer[] checkValid(Map<Integer, ArraySparseSet<Integer>> groudTruth, ArrayList<Map<Integer, ArraySparseSet<Integer>>> allResult) {
        Integer[] resultSize = new Integer[allResult.size() + 1];
        for (int i = 0; i < allResult.size(); ++i) resultSize[i] = 0;
        Integer mergeSize = 0;
        for (Map.Entry<Integer, ArraySparseSet<Integer>> entry : groudTruth.entrySet()) {
            ArraySparseSet<Integer> allMerge = null;
            int id = 0;
            for (Map<Integer, ArraySparseSet<Integer>> result : allResult) {
                //assert result.containsKey(entry.getKey());
                ArraySparseSet currentRes = result.get(entry.getKey());
                // System.out.println(entry.getValue() + " " + currentRes);
                for (Integer allocId : entry.getValue()) {
                    assert currentRes.contains(allocId);
                }
                if (allMerge == null) allMerge = currentRes.clone();
                else allMerge.intersection(currentRes, allMerge);
                resultSize[id] += currentRes.size();
                id += 1;
            }
            mergeSize += allMerge.size();
        }
        resultSize[allResult.size()] = mergeSize;
        return resultSize;
    }

    void printResult(String name, Integer[] numbers) {
        name = String.format("%3s", name);
        assert numbers.length == allTransformer.size() + 1;
        int id = 0;
        String ans = "";
        for (Class<? extends AbstractPTATransformer> type : allTransformer) {
            ans += type + ": " + String.format("%3d", numbers[id]) + "\t";
            id += 1;
        }
        ans += "AllMerge: " + String.format("%3d", numbers[id]);
        System.out.println("[Result Of " + name + "] " + ans);
    }

    Integer[] runSingleData(int testId) {
        System.out.println("[Run TestCase] " + testId) ;
        Map<Integer, ArraySparseSet<Integer>> groundTruth = getGroundTruth(testId);
        ArrayList<Map<Integer, ArraySparseSet<Integer>>> results = getResults(testId);
        return checkValid(groundTruth, results);
    }

    public void testAllTransformerWithSingleData(int testId) {
        printResult(((Integer)testId).toString(), runSingleData(testId));
    }

    public void testAllTransformerWithAllData() {
        Integer ans[] = new Integer[allTransformer.size() + 1];
        List<Integer[]> allRes = new ArrayList<>();
        for (int i = 0; i < ans.length; ++i) ans[i] = 0;
        for (int i = 1; i <= datasetSize; ++i) {
            Integer[] singleRes = runSingleData(i);
            for (int j = 0; j < singleRes.length; ++j)
                ans[j] += singleRes[j];
            allRes.add(singleRes);
        }
        for (int i = 1; i <= datasetSize; ++i) {
            printResult(((Integer)i).toString(), allRes.get(i - 1));
        }
        printResult("all", ans);
    }
}
