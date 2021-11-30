package parallelProcessing;

import java.util.concurrent.*;

public class Test8_9 {

    public static void main(String[] args) throws InterruptedException, ExecutionException{
        ExecutorService es = Executors.newFixedThreadPool(3);
        Future<String> f = es.submit(() -> "call");
        System.out.println(f.get());
        // ExecutorService は明示的に終了する必要がある。
        // しかし、終了しなくてもコンパイルエラーや例外にはならない。
        es.shutdown();
    }
}
