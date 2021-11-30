package streamApi;

import java.util.*;

public class Test6_4 {

    public static void main(String[] args) {
        List<String> guestList = Arrays.asList("A","BB","CCC","DDDD");
        System.out.println(guestList.stream().filter(x -> x.length() > 2).count());
    }
}
