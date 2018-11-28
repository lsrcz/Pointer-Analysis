package jry.test;

public class TryCallGraph {
    public static void main(String[] args) {
        CallGraph cGraph = new CallGraph();
        cGraph.printGraph("../dataset/code", "test.InterFlow");
    }
}
