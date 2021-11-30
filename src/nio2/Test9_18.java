package nio2;

import java.io.*;
import java.nio.file.*;
import static java.nio.file.StandardCopyOption.*;

public class Test9_18 {

    public static void main(String[] args) throws IOException {
        Path source = Paths.get("C:\\opt\\java_gold_test\\test.txt");
        Path target = Paths.get("C:\\opt\\java_gold_test\\info\\sample.txt");
        Files.move(source, target, ATOMIC_MOVE);
        Files.delete(source);
    }
}
