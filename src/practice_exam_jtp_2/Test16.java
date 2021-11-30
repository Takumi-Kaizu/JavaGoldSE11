package practice_exam_jtp_2;

import java.util.*;

// Eclipse だと上手く動かない。。。(MissingResourceException が発生する)
// コマンドプロンプトでの実行だと上手くいく

public class Test16 {

    public static void main(String[] args) {
        System.out.println(load());
    }
    static Object load() {
        ResourceBundle r =
                ResourceBundle.getBundle("Test16", Locale.US);
        return r.getObject("AM");
    }
}
