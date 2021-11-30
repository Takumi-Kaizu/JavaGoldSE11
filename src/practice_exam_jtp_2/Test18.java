package practice_exam_jtp_2;

import java.util.*;
import java.util.stream.*;

public class Test18 {

    public static void main(String[] args) {
        List<Customer> list = List.of(new Customer("Aiden", "Member"),
                new Customer("Mason", "Visitor"),
                new Customer("Liam", "Member"));
        // partitioningBy()メソッドの戻り値は Map<Boolean, List<Customer>> となる。
        // そのため、forEach((b, m) -> System.out.prin(m)) は
        // forEach((Boolean, List<Customer>) -> System.out.print(List<Customer>)) という意味になる。
        list.stream()
                .collect(Collectors.partitioningBy(c -> c.getType().equals("Member")))
                .forEach((b, m) -> System.out.print(m));
    }
}

class Customer {
    private String name;
    private String type;
    public Customer(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public String toString() {
        return name;
    }
}