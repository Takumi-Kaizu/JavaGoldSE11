package practice_exam_jtp_1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import static java.nio.file.StandardCopyOption.*;

public class Test61 {

    public static void main(String[] args) {
        try {
            Path p1 = Paths.get("C:\\opt\\java_gold_test\\test1.txt");
            Path p2 = Paths.get("C:\\opt\\java_gold_test\\test2.txt");
            Files.move(p1, p2, REPLACE_EXISTING);
        }catch(IOException e) {
            e.printStackTrace();
        }
    }
}
