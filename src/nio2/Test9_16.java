package nio2;

import java.io.*;
import java.nio.file.*;

public class Test9_16 {

    public static void main(String[] args) {
        Path p1 = Paths.get("C:\\opt\\java_gold_test\\test.txt");
        Path p2 = Paths.get("C:\\opt\\java_gold_test\\info\\test.txt");
        try {
            Files.copy(p1, p2, StandardCopyOption.REPLACE_EXISTING);
        }catch(IOException e) {
            System.out.println("IOException");
        }
    }
}
