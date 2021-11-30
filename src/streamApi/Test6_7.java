package streamApi;

import java.util.*;

public class Test6_7 {

    public static void main(String[] args) {
        List<String> or = Arrays.asList("Pen-100-Tokyo", "Note-150-Tokyo", "Pen-100-Osaka");
        or.stream()
          .filter(s -> s.contains("Tokyo"))
          .sorted()
          .forEach(System.out::println);
    }
}
