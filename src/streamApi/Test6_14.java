package streamApi;

import java.io.*;
import java.nio.file.*;
import java.util.stream.*;

public class Test6_14 {

    public static void main(String[] args) {
        Stream<Path> p = Stream.of(
                Paths.get("C:\\opt\\java_gold_test\\sample.html"),
                Paths.get("C:\\opt\\java_gold_test\\sample.txt"));
        p.filter(s -> s.toString()
                       .endsWith("txt"))
                       .forEach(s -> {
                           try {
                               Files.readAllLines(s)
                                    .stream()
                                    .forEach(System.out::println);
                           } catch(IOException e) {
                               System.out.println("Exception");
                           }
                       });
    }
}
