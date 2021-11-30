package practice_exam_jtp_2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test12 {
    static void func(String[] duke) {
        int len = 0;
        Pattern p = Pattern.compile("^Duke.*");
        for (int i = 0; i < duke.length; i++) {
            Matcher m = p.matcher(duke[i]);
            if (m.matches()) {
                len += m.group().length();
            }
        }
        System.out.println(len);
    }
    public static void main(String args[]) {
        String[] duke = { "DukeProject", "777Duke999",
                          "Duke Test!", "Duke", "Dukeee" };
        func(duke);
    }
}
