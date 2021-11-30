package nio2;

import java.io.*;

public class Test9_3 {

    public static void main(String[] args) {
        Console con = System.console();
        // readLine() は引数の値が入力待ち状態時に表示される
        con.printf(con.readLine("Gold"));
    }
}
