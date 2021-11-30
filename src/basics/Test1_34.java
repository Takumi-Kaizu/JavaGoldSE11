package basics;

interface Test1 {
    public default void func() {
        System.out.println("Test1");
    }
}

interface Test2 extends Test1 {
    public default void func() {
        Test1.super.func();
    }
}

public class Test1_34 implements Test2 {

    public static void main(String[] args) {
        Test1_34 t = new Test1_34();
        t.func();
    }
}
