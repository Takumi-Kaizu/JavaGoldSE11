package nio2;

import java.io.*;
import java.nio.file.*;

public class Test9_14 {

    public static void main(String[] args) {
        String str = "C:\\.\\gold\\test\\..\\sample.txt";
        File f = new File(str);
        // ファイルへのパスを Path情報に変換する。
        // C:\\.\\gold\\test\\..\\sample.txt : normalize 前 → . gold test .. sample.txt の5つ
        // C:\\gold\\sample.txt              : normalize 後 → gold sample の2つ
        Path p = f.toPath();
        // getNameCount()...パス情報からルートを除く要素の数を返す
        System.out.print(p.getNameCount() + " ");
        System.out.print(p.normalize().getNameCount());
    }
}
