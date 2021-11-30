package localize_format;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class Test12_8 {

    public static void main(String[] args) {
        DateFormat df;
        df = DateFormat.getDateInstance(DateFormat.DEFAULT, Locale.US);
        System.out.print(df.format(new Date()));
    }
}
