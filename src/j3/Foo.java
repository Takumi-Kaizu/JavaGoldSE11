package j3;
public class Foo implements AutoCloseable{
    public static void main(String[] args) throws Exception{
        try(Foo obj = new Foo()){
            System.out.println("x");
        }
    }
    public void close() throws Exception {
        throw new Exception("y");
    }
}