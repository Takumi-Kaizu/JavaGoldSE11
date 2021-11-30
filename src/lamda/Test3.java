package lamda;

import java.util.function.*;

public class Test3 {

    public static void main(String[] args) {
        BiFunction<Double, Integer, Double> val = (t1, t2) -> t1 + t2;
        System.out.println(val.apply(10.0, 10));
    }
}
