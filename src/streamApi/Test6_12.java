package streamApi;

import java.util.*;

public class Test6_12 {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5);
        list.stream()
            .map(n -> n * 2)
            //.forEach(s -> System.out.print(s + " "));
            .peek(t -> System.out.print(t + " "))
            //.peek(System.out::print)
            .count();
    }
}
