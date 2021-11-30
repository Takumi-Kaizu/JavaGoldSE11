package nio2;

import java.io.*;
import java.nio.file.*;

public class Test9_21 {

    public static void main(String[] args) {
        Path dir = Paths.get("C:\\gold");
        try (DirectoryStream<Path> ds = Files.newDirectoryStream(dir, "*.{java, jar}")){
            for(Path p : ds) {
                System.out.print(p.getFileName());
            }
        }catch(IOException e) {
            System.out.print("IOException");
        }
    }
}
