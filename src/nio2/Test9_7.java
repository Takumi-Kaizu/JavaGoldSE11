package nio2;

import java.io.*;

public class Test9_7 {

    public static void main(String[] args) {
        String file = "foo.txt";
        String line;
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(file));
                BufferedReader br = new BufferedReader(new FileReader(file));) {
            bw.write("Gold");
            bw.flush();
            while((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.err.print("FileNotFoundException");
        } catch (IOException e) {
            System.err.print("IOException");
        }
    }
}
