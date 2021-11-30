package streamApi;

import java.util.*;
import java.util.function.*;

public class Test6_9 {

    public static void main(String[] args) {
        UnaryOperator<String> uo = s -> s.concat(s.toUpperCase());
        Arrays.asList("aa", "bb", "cc")
              .stream()
              .map(uo)
              .forEach(System.out::print);
    }
}
