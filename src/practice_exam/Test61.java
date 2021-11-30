package practice_exam;

import java.util.concurrent.*;
import java.util.stream.*;

public class Test61 {
    static void exec(CyclicBarrier c) {
        try {
          c.await();
          System.out.print("hey ");
        } catch(BrokenBarrierException | InterruptedException e) { }
      }
      public static void main(String[] args) {
       ExecutorService service = null;
        try {
          service = Executors.newFixedThreadPool(2);
          CyclicBarrier c = new CyclicBarrier(1);
          IntStream.iterate(0, i -> i + 1).limit(3)
                   .parallel().forEach(i -> exec(c));
        } finally {
          if(service != null) service.shutdown(); 
        }
      }
}
