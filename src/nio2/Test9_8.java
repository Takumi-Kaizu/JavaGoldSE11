package nio2;

import java.io.*;

public class Test9_8 {

    public static void main(String[] args) {
        try {
            Test t = new ExTest();
            t.func();
        } catch (Exception e) {
            System.out.println(e.getClass());
            System.out.println("指定されたファイルが見つかりません。");
        }
    }
}

class Test {
    public void func() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("test9_8.txt"));
        String data = "";
        while((data = br.readLine()) != null) {
            System.out.println(data);
        }
    }
}

class ExTest extends Test {
    public void func() throws IOException {
        super.func();
        System.out.println("func()");
    }
}
