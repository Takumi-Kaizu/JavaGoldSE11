package nio2;

import java.io.*;

public class Test9_1 {

    public static void main(String[] args) {
        try {
            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
            System.out.print(">> ");
            String s = in.readLine();
            System.out.println(s);
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}
