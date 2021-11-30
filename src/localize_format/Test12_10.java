package localize_format;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Test12_10 {

    public static void main(String[] args) {
        SimpleDateFormat sdf;
        sdf = new SimpleDateFormat("MMMM", Locale.US);
        System.out.print(sdf.format(new Date()));
    }
}
