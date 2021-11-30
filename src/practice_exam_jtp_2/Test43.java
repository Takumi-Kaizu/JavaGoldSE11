package practice_exam_jtp_2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Test43 {

    public static void main(String[] args) throws IOException {
        Path p1 = Paths.get("C:\\opt\\java_gold_test\\test43\\duke.txt");
        Path p2 = Paths.get("C:\\opt\\java_gold_test\\test43\\test.txt");
        Path p3 = Paths.get("C:\\opt\\optest.txt");
        Files.copy(p1, p2);
        //Files.delete(p2);
        Files.copy(p2, p3);
        Files.delete(p2);
    }
}
