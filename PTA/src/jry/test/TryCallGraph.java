package jry;

public class TryCallGraph {
    public static void main(String[] args) {
        CallGraph cGraph = new CallGraph();
        cGraph.printGraph("code/src", "Hello");
    }
}
