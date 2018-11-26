import basic.PointsToAnalysis;
import vasco.callgraph.*;

public class Main {

    public static void main(String[] args) {
        PointsToAnalysis pta = new PointsToAnalysis();
        pta.run("../dataset/code", "test.FieldSensitivity");
    }
}
