package practice_exam_jtp_1;

import java.io.*;
import java.nio.file.*;

public class Test1 {

    public static void main(String[] args) {
        try {
            Path p1 = Paths.get("C:\\opt\\java_gold_test\\mogi1\\gold\\test.txt");
            Path p2 = Paths.get("C:\\opt\\java_gold_test\\mogi1\\info\\test.txt");
            Files.copy(p1, p2, StandardCopyOption.REPLACE_EXISTING, LinkOption.NOFOLLOW_LINKS);
            if(Files.isSameFile(p1, p2)) {
                System.out.print("same");
            } else {
                System.out.print("not");
            }
        } catch (IOException e) {
            System.out.println("IOException");
            e.printStackTrace();
        }
    }
}
