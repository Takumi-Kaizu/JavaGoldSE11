package parallelProcessing;

import java.util.*;
import java.util.concurrent.*;

public class Test8_8 {

    public static void main(String[] args) {
        ArrayList<Future<String>> list = new ArrayList<>();
        ExecutorService e = Executors.newCachedThreadPool();
        try {
            // call()メソッドは、オブジェクトが生成された段階で呼び出される。
            list.add(e.submit(new ExTest("1")));
            list.add(e.submit(new ExTest("2")));
            e.shutdown();
            // シャットダウンしたサービスを再起動することはできない。
            list.add(e.submit(new ExTest("3")));
            for(Future<String> f : list) {
                System.out.print(f.get());
            }
        }catch(Exception ex) {
            ex.printStackTrace();
        }
    }
}

class ExTest implements Callable<String> {
    private String name;
    public ExTest(String name) {
        this.name = name;
    }
    public String call() throws Exception {
        for(int i=0; i<3; i++) {
            System.out.print(name + " ");
            Thread.sleep(1000);
        }
        return name + "-END ";
    }
}