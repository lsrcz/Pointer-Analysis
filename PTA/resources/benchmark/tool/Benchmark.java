package benchmark.tool;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class Benchmark {
    public static Map<Integer, Integer> result = new TreeMap<Integer, Integer>();

    public static void alloc(int id) {
        Counter.count = id;
    }
    /*
    public static void test(int id, String targetVariable) {

    }
    */
    public static void test(int id, Object targetVariable) {
        result.put(id, ((BasicClass)targetVariable).allocId);
    }

    public static void print() {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("log.txt");
            for (Map.Entry<Integer, Integer> entry : result.entrySet()) {
                fileOutputStream.write((entry.getKey() + " " + entry.getValue() + "\n").getBytes());
            }
            fileOutputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}
