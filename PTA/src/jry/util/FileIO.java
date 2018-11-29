package jry.util;

import java.io.*;
import java.util.LinkedList;
import java.util.List;

public class FileIO {
    public static void write(String file, String s) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            fileOutputStream.write(s.getBytes());
            fileOutputStream.close();
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    public static List<String> readLines(String file) {
        File inputFile = new File(file);
        List<String> result = new LinkedList<String>();
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            while (true) {
                String now = bufferedReader.readLine();
                if (now == null) break;
                result.add(now);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }

    public static String read(String file) {
        File inputFile = new File(file);
        Long length = inputFile.length();
        byte fileContent[] = new byte[length.intValue()];
        try {
            FileInputStream fileInputStream = new FileInputStream(inputFile);
            fileInputStream.read(fileContent);
            fileInputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return new String(fileContent);
    }
}
