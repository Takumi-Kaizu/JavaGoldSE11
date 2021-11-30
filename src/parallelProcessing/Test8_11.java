package parallelProcessing;
public class Test8_11 {

    public static void main(String[] args) {
        CountThread c1 = new CountThread();
        CountThread c2 = new CountThread();
        c1.setCountThread(c2);
        c2.setCountThread(c1);
        c1.start();
        c2.start();
    }
}

class CountThread extends Thread {
    CountThread c;
    int i = 0;
    public void setCountThread(CountThread c) {
        this.c = c;
    }
    public synchronized void display(CountThread c) {
        try {
            Thread.sleep(10);
            c.show();
        } catch (InterruptedException e) {
            
        }
    }
    public synchronized void show() {
        System.out.println(c.getName());
    }
    public void run() {
        display(c);
    }
}