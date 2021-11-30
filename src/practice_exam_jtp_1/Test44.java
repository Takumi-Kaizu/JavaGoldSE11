package practice_exam_jtp_1;

import java.util.*;
import java.util.function.*;

public class Test44 {

    public static void main(String[] args) {
        var list = List.of(10, 20, 30);
        Function<Integer, Integer> f = n -> n * n;
        StringBuilder sb = new StringBuilder();
        for(int num : list) {
            sb.append(f.apply(num));
            sb.append(" : ");
        }
        System.out.println(sb);
    }
}
