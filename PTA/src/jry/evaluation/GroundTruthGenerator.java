package jry.evaluation;

import jry.util.ExecCMP;
import jry.util.FileIO;
import jry.util.ResultOperator;
import soot.toolkits.scalar.ArraySparseSet;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class GroundTruthGenerator {
    public static void getGroundTruth(int testId) {
        RunnableTestGenerator generator = new RunnableTestGenerator();
        ResultOperator result = null;
        for (int i = 0; i <= 10; ++i) {
            String fileName = generator.changeToRunnable(testId, i);
            Object execInfo = ExecCMP.exec("javac -cp resources resources/runnabledataset/Test" + testId + ".java;" +
                    "java -cp resources runnabledataset.Test" + testId);
            List<String> currentAns = FileIO.readLines("log.txt");
            FileIO.remove("log.txt");
            System.out.println(currentAns);
            Map<Integer, ArraySparseSet<Integer>> map = new TreeMap<Integer, ArraySparseSet<Integer>>();
            for (String line : currentAns) {
                String[] numbers = line.split(" ");
                assert numbers.length == 2;
                int queryId = Integer.parseInt(numbers[0]);
                int allocId = Integer.parseInt(numbers[1]);
                ArraySparseSet<Integer> set = new ArraySparseSet<>();
                set.add(allocId);
                map.put(queryId, set);
            }
            if (result == null) {
                result = new ResultOperator(map);
            } else result.Union(map);
        }
        FileIO.write("resources/dataset/GroundTruth" + testId + ".txt", result.toString());
    }
}
