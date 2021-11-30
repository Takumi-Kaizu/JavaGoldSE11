package parallelProcessing;
public class Test8_2 {

    public static void main(String[] args) {
        Runnable r = () -> System.out.print(Thread.currentThread().getName());
        try {
            Thread t1 = new Thread(r, "t1 ");
            t1.start();
            Thread.sleep(1000);
            Thread t2 = new Thread(r, "t2 ");
            t2.start();
            // スレッド2 を 1秒停止させる
            //t2.sleep(1000);
            Thread.sleep(1000);
            System.out.print("Finish ");
        } catch (InterruptedException e) {
            
        }
    }
}
