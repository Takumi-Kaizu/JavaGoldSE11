package nio2;

import java.io.*;

public class Test9_2 {

    public static void main(String[] args) {
        Console c = System.console();
        while(true) {
            System.out.print(">> ");
            String data = c.readLine();
            if(data.equals("")) {
                break;
            }
            System.out.println("input : " + data);
        }
        System.out.println("---finish---");
    }
}
