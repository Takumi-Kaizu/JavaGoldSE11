package lamda;

interface Sample {
    public int func(int i);
}

public class Test2 {

    public static void main(String[] args) {
        Sample s1 = i -> i + i + 10;
        Sample s2 = i -> Integer.valueOf(i);
        Sample s3 = i -> 100;
        Sample s4 = i -> { throw new RuntimeException();};
    }
}
