package nio2;

import java.nio.file.*;

public class Test9_10 {

    public static void main(String[] args) {
        Path p = Paths.get("C:\\opt\\java_gold_test\\test.txt");
        System.out.print(p.getName(0) + " : " + p.subpath(0, 2));
    }
}
