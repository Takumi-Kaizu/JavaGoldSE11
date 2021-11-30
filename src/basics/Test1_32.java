package basics;

interface Foo {
    public static void func() {
        System.out.println("Foo");
    }
}

interface Bar {
    public default void func() {
        System.out.println("Bar");
    }
}

class Baz implements Foo, Bar {
    
}

public class Test1_32 {

    public static void main(String[] args) {
        Baz baz = new Baz();
        baz.func();
    }
}
