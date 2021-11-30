package practice_exam_jtp_2;

import java.util.*;
import java.util.stream.*;

public class Test75 {
    public static void main(String[] args) {
        List<Member> list = List.of(new Member("Joker"),
                                    new Member("Skull"),
                                    new Member("Panther"),
                                    new Member("Fox"),
                                    new Member("Queen"),
                                    new Member("Navi"),
                                    new Member("Noir"));
        list.add(new Member("aaa"));
        // Skull, Queen が原因で false が返却される。
        boolean b = list.stream()
                        .map(m -> m.getName())
                        .filter(n -> n.length() > 4)
                        .allMatch(m -> m.endsWith("r"));
        System.out.println(b);
    }
}
class Member {
    private String name;
    public Member(String name) {
        this.name = name;
    }
    public String getName() { return name; }
}