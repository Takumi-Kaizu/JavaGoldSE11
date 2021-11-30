package practice_exam_jtp_1;
public class Test10 {

    public static void main(String[] args) {
        TestThread tt = new TestThread();
        tt.run();
        tt.start();
        tt.run();
        tt.run();
        //tt.start();
    }

}
class TestThread extends Thread {
    public void run() {
        System.out.print("test ");
    }
}