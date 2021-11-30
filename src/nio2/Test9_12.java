package nio2;

import java.nio.file.*;

public class Test9_12 {

    public static void main(String[] args) {
        Path p = Paths.get("C:\\gold\\..\\info\\test\\.\\..\\sample.txt");
        System.out.println(p);
        // パスの冗長性を排除する。
        System.out.println(p.normalize());
    }
}
