package nio2;

import java.io.*;
import java.nio.file.*;

public class Test9_22 {

    public static void main(String[] args) throws IOException {
        Path p = Path.of("C:\\opt\\java_gold_test");
        System.out.println(p);
        // list()メソッド...指定したディレクトリ配下を探索する。それ以下のディレクトリは探索しない。
        Files.list(p).forEach(t -> System.out.println(t + " : "));
    }
}
