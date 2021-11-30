package officialSample;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Test14 {
    public static void main(String[] args) {
        Path file1 = Paths.get("/home/duke/./doc/abc.txt");

        Path file2 = Paths.get("/home/duke/doc/xyz.txt");

        Path path1 = file2.relativize(file1);

        Path path2 = file2.resolve("../web/page.html");

        System.out.println(path1.getNameCount());

        System.out.println(path2.getNameCount());
    }
}
