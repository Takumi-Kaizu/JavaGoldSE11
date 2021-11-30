package nio2;

import java.io.*;

public class Test9_5 {

    public static void main(String[] args) {
        String file = "data.bin";
        try (OutputStream fos = new FileOutputStream(file);
             //DataOutputStream dos = new DataOutputStream(fos);
             InputStream fis = new FileInputStream(file);){
             //DataInputStream dis = new DataInputStream(fis);){
            //dos.writeByte(0);
            //System.out.println(fis.read());
            fos.write((byte)0);
            System.out.println(fis.read());
        }catch (IOException e) {
            System.out.println(e.getClass());
        }
    }
}
