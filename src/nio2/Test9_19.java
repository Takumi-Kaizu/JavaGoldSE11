package nio2;

import java.io.*;
import java.nio.file.*;
import static java.nio.file.LinkOption.*;

public class Test9_19 {

    public static void main(String[] args) {
        Path p = Paths.get("C:\\gold\\test.txt");
        try {
            if(Files.notExists(p, NOFOLLOW_LINKS)) {
                Files.delete(p);
            } else {
                System.out.print("FALSE");
            }
        // FileNotFoundException は「ファイルを開く」時のエラー
        } catch (FileNotFoundException e) {
            System.out.print("FileNotFoundException");
        // NoSuchFileException は「ファイルが存在しない」時のエラー
        } catch (NoSuchFileException e) {
            System.out.print("NoSuchFileException");
        } catch (IOException e) {
            System.out.print("IOException");
        }
    }
}
