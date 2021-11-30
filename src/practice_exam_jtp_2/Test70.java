package practice_exam_jtp_2;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Test70 {

    public static void main(String[] args) {
        Path p1 = Paths.get("C:\\gold\\.\\cert\\..\\exam\\.\\..\\test");
        System.out.print(p1.normalize());
    }
}
