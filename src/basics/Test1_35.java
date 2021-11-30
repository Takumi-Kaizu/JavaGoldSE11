package basics;

interface Sample {
    public default void func1() {
        func2();
    }
    
    private void func2() {
        System.out.println("Sample");
    }
}

public class Test1_35 implements Sample {

    public void func2() {
        System.out.println("Test");
    }
    
    public static void main(String[] args) {
        Sample s = new Test1_35();
        s.func1();
    }
}
