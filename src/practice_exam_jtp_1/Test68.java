package practice_exam_jtp_1;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;

public class Test68 {

    public static void main(String[] args) {
        new ArrayList<>(Arrays.asList("Gold", "Silver", "Bronze"))
                .parallelStream()
                .forEachOrdered(e -> System.out.print(e + " "));
    }
}