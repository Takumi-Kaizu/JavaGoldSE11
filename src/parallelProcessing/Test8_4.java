package parallelProcessing;

public class Test8_4 {

    public static void main(String[] args) throws InterruptedException {
        // この書き方を匿名クラスという。
        Runnable r = () -> {
            for(int i = 0; i < 10000; i++) {
                if(i == 9999) {
                    System.out.print("run ");
                }
            }
        };
        Thread t = new Thread(r);
        t.start();
        // join() はスレッドの終了を待ち合わせる
        // 要するにメインスレッドはスレッドの終了を待つ。
        t.join();
        System.out.print("main ");

        //        catch(InterruptedException e) {
        //            System.out.print("Exception");
        //        }
    }
}
