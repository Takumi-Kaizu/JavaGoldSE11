package nio2;

import java.nio.file.*;

public class Test9_13 {

    public static void main(String[] args) {
        Path p1 = Paths.get("C:\\gold\\.");
        // resolve()メソッド...指定したパス情報をそのまま結合する。
        p1 = p1.resolve("dir1");
        Path p2 = Paths.get("C:\\gold");
        // 絶対パスの形(\\dir2、要は /dir2)で渡すと、渡した絶対パスをそのまま return する
        p2 = p2.resolve("\\dir2");
        System.out.print(p1 + " : ");
        System.out.print(p2);
    }
}
