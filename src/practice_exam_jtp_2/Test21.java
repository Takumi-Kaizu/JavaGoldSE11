package practice_exam_jtp_2;

import java.util.*;

public class Test21 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("jp"); list.add("us"); list.add("sg");
        list.stream().forEach(i -> i.toUpperCase());
        list.stream().forEach(s -> System.out.print(s + " "));
    }
}
