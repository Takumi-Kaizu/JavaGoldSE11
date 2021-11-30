package streamApi;

import java.util.*;
import java.util.function.*;

public class Test6_13 {

    public static void main(String[] args) {
        List<String> shapes = Arrays.asList("circle", "square", "rectangle", "particle");
        Predicate<String> test = n -> {
            System.out.print("Checking.../ ");
            return n.contains("cle");
        };
        shapes.stream()
              .filter(c -> c.length() > 5)
              .allMatch(test);
        // allMatch は引数に条件を指定する。
        // 入ってきた要素が条件に合致しなければ、その時点で処理を終了して false を返す。
    }
}
