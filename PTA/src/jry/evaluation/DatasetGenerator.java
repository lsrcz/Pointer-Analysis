package jry.evaluation;

public class DatasetGenerator {
    public static void main(String[] args) {
        for (int i = 3; i <= 15; ++i) {
            CodeGenerator generator = new CodeGenerator(2, 10, 10,10,"Test" + i, 5);
            System.out.println("[Gen " + i + "]" + generator.generateCode().length());
            GroundTruthGenerator.getGroundTruth(i);
        }
        for (int i = 16; i <= 30; ++i) {
            CodeGenerator generator = new CodeGenerator(5, 4, 4, 10, "Test" + i, 10);
            System.out.println("[Gen " + i + "]" + generator.generateCode().length());
            GroundTruthGenerator.getGroundTruth(i);
        }
        for (int i = 31; i <= 45; ++i) {
            CodeGenerator generator = new CodeGenerator(5, 10, 10, 3, "Test" + i, 10);
            System.out.println("[Gen " + i + "]" + generator.generateCode().length());
            GroundTruthGenerator.getGroundTruth(i);
        }
    }
}