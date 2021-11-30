package practice_exam_jtp_2;

import java.util.*;

public class Test76 {
    public static void main(String[] args) {
        TreeSet<String> ts = new TreeSet<>();
        ts.add("DD"); ts.add("AA"); ts.add("CC"); ts.add("BB");
        ts.last();
        ts.pollFirst();
        System.out.println(ts.first() + " : " + ts.size());
    }
}
