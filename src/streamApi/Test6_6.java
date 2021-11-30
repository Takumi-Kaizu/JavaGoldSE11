package streamApi;

import java.util.stream.Stream;

public class Test6_6 {

    public static void main(String[] args) {
        Stream.of(1,2,3,4,5,6,7,8,9,10)
              .filter(i -> i % 2 == 0)
              .skip(4)
              .forEach(System.out::print);
    }
}
