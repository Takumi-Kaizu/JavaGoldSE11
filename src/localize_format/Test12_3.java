package localize_format;

import java.util.*;

public class Test12_3 {

    public static void main(String[] args) {
        Locale loc = Locale.getDefault();
        System.out.print(loc.getDisplayLanguage() + " : ");
        System.out.println(loc.getDisplayCountry());
        loc = new Locale("en");
        System.out.print(loc.getDisplayLanguage() + " : ");
        System.out.print(loc.getDisplayCountry());
    }
}
