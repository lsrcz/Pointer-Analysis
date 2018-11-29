package jry.evaluation;

import jry.util.FileIO;

public class RunnableTestGenerator {
    static final String locFile = "resources/runnabledataset/";

    static final String prePackage = "package dataset;";
    static final String newPackage = "package runnabledataset;";

    private String changePackage(String code) {
        return code.replaceAll(prePackage, newPackage);
    }

    static final String preBenchmark = "import benchmark\\.internal\\.Benchmark;";
    static final String newBenchmark = "import benchmark\\.tool\\.Benchmark;";

    private String changeBenchmark(String code) {
        return code.replaceAll(preBenchmark, newBenchmark);
    }

    static final String inputValueString = "int inputValue = ";

    private String changeInputValue(String code, int inputValue) {
        return code.replaceAll(inputValueString + "0", inputValueString + inputValue);
    }

    public String changeToRunnable(int testId, int inputValue) {
        System.out.println("[Generate] testcase: " + testId + " input value: " + inputValue);
        String code = FileIO.read("resources/dataset/Test" + testId + ".java");
        code = changePackage(code);
        code = changeBenchmark(code);
        code = changeInputValue(code, inputValue);
        String fileName = "resources/runnabledataset/Test" + testId;
        // System.out.println(code);
        FileIO.write( fileName + ".java", code);
        return fileName;
    }
}
