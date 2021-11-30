package practice_exam_jtp_1;
public class Test40 {

    public static void main(String[] args) {
        try(MyResource mr = new MyResource()){
            System.out.print("try ");
            throw new Exception();
        }catch(Exception e) {
            System.out.print("catch ");
        }finally {
            System.out.print("finally ");
        }
    }
}

class MyResource implements AutoCloseable {
    public void close() throws Exception {
        System.out.print("close ");
    }
}