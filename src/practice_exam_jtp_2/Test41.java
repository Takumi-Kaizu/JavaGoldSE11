package practice_exam_jtp_2;

import java.util.*;

public class Test41 {
    public static void main(String[] args) {
        List<Employee> list = List.of(new Employee("T101"),
                                      new Employee("T102"));
        list.stream().forEach(Employee::getId);
    }
}
class Employee {
    private String id;
    public Employee(String id) {
        this.id = id;
    }
    public void getId() {
        System.out.print(id + " ");
    }
//    public static void getId(Employee e) {
//        System.out.print(e.id + " ");
//    }
}