package basics;

interface Foo1 {
    public default void func() {
        System.out.println("Foo");
    }
}

interface Bar1 extends Foo1 {
//    public static void func() {
//        System.out.println("Bar");
//    }
}

public class Test1_33 {

    public static void main(String[] args) {
        Baz baz = new Baz();
        baz.func();
    }
}
