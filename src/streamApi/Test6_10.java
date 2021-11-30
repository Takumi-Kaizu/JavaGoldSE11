package streamApi;

import java.util.*;
import java.util.function.*;

public class Test6_10 {

    public static void main(String[] args) {
        UnaryOperator<Double> uo = s -> s / 50;
        List<Double> list = Arrays.asList(250.0, 500.0, 600.0);
        list.stream()
            .filter(s -> s > 300.0)
            .map(s -> uo.apply(s))
            .forEach(s -> System.out.print(s + " "));
    }
}
