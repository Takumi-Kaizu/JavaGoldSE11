package lamda;

import java.util.*;
import java.util.function.*;

// 問題集 5-12
public class Test4 {

    public static void main(String[] args) {
        List<Double> codes = Arrays.asList(10.0, 20.0);
        UnaryOperator<Double> uo = s -> s + 10.0;
        codes.replaceAll(uo);
        codes.forEach(System.out::println);
        // codes.forEach(c -> System.out.println(c))
    }
}
