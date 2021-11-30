package nio2;

import java.nio.file.*;

public class Test9_11 {

    public static void main(String[] args) {
        Path p = Paths.get("C:\\opt\\opt2\\java_gold_test");
        if(p.startsWith("dir1")) {
            System.out.print("TRUE ");
        }else {
            System.out.print("FALSE ");
        }
        System.out.println(p.relativize(Paths.get("C:\\opt\\dir2")));
    }
}
