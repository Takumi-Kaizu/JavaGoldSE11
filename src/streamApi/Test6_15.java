package streamApi;

import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Test6_15 {

    public static void main(String[] args) {
        List<Customer> list = Arrays.asList(
                new Customer(10, "Gold"),
                new Customer(11, "Silver"),
                new Customer(12, "Bronze"));
        Predicate<Customer> p = s -> s.getId() > 10;
        list = list.stream()
                   .filter(p)
                   .collect(Collectors.toList());
        Stream<String> name = list.stream().map(Customer::getName);
        name.forEach(n -> System.out.print(n + " "));
    }
}

class Customer {
    private int id;
    private String name;
    public Customer(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
}