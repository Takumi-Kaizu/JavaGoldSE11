package parallelProcessing;

import java.util.concurrent.atomic.*;
import java.util.*;

public class Test8_15 {

    public static void main(String[] args) {
        ArrayList<AtomicInteger> list = new ArrayList<>();
        for(int i=0; i<5; i++) {
            list.add(new AtomicInteger());
        }
        for(int i=0; i<list.size(); i++) {
            AtomicInteger value = list.get(i);
            value.incrementAndGet();
            if((i % 2) == 0) {
                value.compareAndSet(1, 5);
            }
            System.out.print(value + " ");
        }
    }
}
