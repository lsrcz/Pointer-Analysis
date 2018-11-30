package jry.evaluation;

public class DatasetGenerator {
    public static void main(String[] args) {
        for (int i = 2; i <= 15; ++i) {
            //CodeGenerator generator = new CodeGenerator(2, 10, 10,10,"Test" + i, 5, 10);
            CodeGenerator generator = new CodeGenerator(2, 2, 1,1,"Test" + i, 2, 10);
            System.out.println("[Gen " + i + "]" + generator.generateCode().length());
            GroundTruthGenerator.getGroundTruth(i);
        }
        for (int i = 16; i <= 30; ++i) {
            CodeGenerator generator = new CodeGenerator(3, 4, 4, 10, "Test" + i, 5, 10);
            System.out.println("[Gen " + i + "]" + generator.generateCode().length());
            GroundTruthGenerator.getGroundTruth(i);
        }
        for (int i = 31; i <= 45; ++i) {
            CodeGenerator generator = new CodeGenerator(3, 6, 4, 3, "Test" + i, 5, 3);
            System.out.println("[Gen " + i + "]" + generator.generateCode().length());
            GroundTruthGenerator.getGroundTruth(i);
        }
    }
}
