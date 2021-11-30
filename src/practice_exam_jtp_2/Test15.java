package practice_exam_jtp_2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test15 {

    public static void main(String[] args) {
        String s = "eeJavaSE,JavaEE,JavaME,JavaDB";
        Pattern p = Pattern.compile("Java.");
        Matcher m = p.matcher(s);
        while (m.find()) {
            System.out.print(m.group() + " : ");
        }
    }
}
