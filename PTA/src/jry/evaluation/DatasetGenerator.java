package jry.evaluation;

public class DatasetGenerator {
    public static void main(String[] args) {
        //Flow
        for (int i = 2; i <= 15; ++i) {
            //CodeGenerator generator = new CodeGenerator(2, 10, 10,10,"Test" + i, 5, 10);
            CodeGenerator generator = new CodeGenerator(3, 3, 3,5,"Test" + i, 5, 5, 1);
            System.out.println("[Gen " + i + "]" + generator.generateCode().length());
            GroundTruthGenerator.getGroundTruth(i);
        }
        //Context
        for (int i = 16; i <= 30; ++i) {
            CodeGenerator generator = new CodeGenerator(3, 3, 5, 2, "Test" + i, 5, 3, 1);
            System.out.println("[Gen " + i + "]" + generator.generateCode().length());
            GroundTruthGenerator.getGroundTruth(i);
        }
        //Field
        for (int i = 31; i <= 45; ++i) {
            CodeGenerator generator = new CodeGenerator(3, 5, 3, 2, "Test" + i, 5, 3, 3);
            System.out.println("[Gen " + i + "]" + generator.generateCode().length());
            GroundTruthGenerator.getGroundTruth(i);
        }
    }
}
