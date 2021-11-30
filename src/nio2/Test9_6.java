package nio2;

import java.io.*;

public class Test9_6 {

    public static void main(String[] args) {
        String file = "test.txt";
        String str[] = { "Java", "Duke", "Gold" };
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(file))) {
            for(int i = 0; i < str.length; i++) {
                bw.write(i + str[i]);
            }
        } catch (IOException e) {
            System.out.println("IOException");
        }
    }
}
