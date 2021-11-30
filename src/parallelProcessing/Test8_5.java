package parallelProcessing;
public class Test8_5 extends Thread {

    public static void main(String[] args) {
        Test8_5 t = new Test8_5();
        t.start();
        try {
            int st = 3000 + (int)(Math.random() * 10000);
            Thread.sleep(st);
        }catch(InterruptedException e) {}
        t.interrupt();
    }
    
    public void run() {
        try {
            while(true) {
                System.out.print("*");
                Thread.sleep(1000);
            }
        } catch(InterruptedException e) {
            System.out.print("Interrupted");
        }
    }
}
