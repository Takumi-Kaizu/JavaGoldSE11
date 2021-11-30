package localize_format;

import java.util.*;

public class Test12_4 {

    public static void main(String[] args) {
        Locale.setDefault(new Locale("en", "US"));
        Locale loc = Locale.getDefault();
        ResourceBundle rb = ResourceBundle.getBundle("MyResources", loc);
        System.out.println(rb.getString("OK"));
    }
}
