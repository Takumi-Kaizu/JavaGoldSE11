package nio2;

import java.io.*;
import java.nio.file.*;
import java.nio.file.attribute.*;

public class Test9_20 {

    public static void main(String[] args) {
        try {
            Path p = Paths.get("C:\\opt\\java_gold_test\\info\\sample.txt");
            // readAttributes()メソッド...一括してファイル属性を取得する
            BasicFileAttributes att = Files.readAttributes(p, BasicFileAttributes.class);
            System.out.println(att.creationTime());
            System.out.println(att.lastAccessTime());
        }catch(IOException e) {
            
        }
    }
}
