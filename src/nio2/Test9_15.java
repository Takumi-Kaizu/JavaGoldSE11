package nio2;

import java.io.*;
import java.nio.file.*;

public class Test9_15 {

    public static void main(String[] args) {
        Path p1 = Paths.get("gold");
        Path p2 = p1.toAbsolutePath();
        // of()メソッド...第一引数と第二引数のパスを結合する。
        Path p3 = Path.of("C:\\opt\\eclipse\\workspace\\ForJavaGoldSE11\\", p1.toString());
        File f = p1.toFile();
        
        System.out.println("p1 が保持するパス：" + p1);
        System.out.println("p2 が保持するパス：" + p2);
        System.out.println("p3 が保持するパス：" + p3);
        
        boolean b1 = p1.equals(p2);
        boolean b2 = p1.equals(f);
        boolean b3 = p2.equals(p3);
        System.out.println(b1 + " : " + b2 + " : " + b3);
    }
}
