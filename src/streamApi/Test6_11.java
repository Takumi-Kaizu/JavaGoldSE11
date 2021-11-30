package streamApi;

import java.util.*;
import java.util.function.*;

// 問題集 6-11
public class Test6_11 {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("Java ", "Duke ", "Gold ");
        Function<String, String> f = s -> "Hello : ".concat(s);
        list.stream().map(f).peek(System.out::print).forEach(System.out::print);
        //list.stream().map(f).peek(System.out::print);
    }
}
