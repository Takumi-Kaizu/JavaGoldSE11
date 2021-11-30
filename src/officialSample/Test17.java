package officialSample;

import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

public class Test17 {
    public static void main(String[] args) throws Exception {

        ExecutorService srv = Executors.newCachedThreadPool();

        Work wk = new Work();

        for(int i = 0; i < 10; i++) {

            srv.execute(wk);

        }

        srv.shutdown();

        srv.awaitTermination(5, TimeUnit.SECONDS); // line 3

        System.out.println(Work.count);

    }
}

class Work implements Runnable {

    public static AtomicInteger count = new AtomicInteger(0);

    public void run() { // line 1

        count.getAndIncrement(); // line 2

    }

}