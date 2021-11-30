package localize_format;

import java.text.NumberFormat;

public class Test12_9 {

    public static void main(String[] args) {
        NumberFormat nf = NumberFormat.getInstance();
        nf.setMaximumIntegerDigits(3);
        System.out.print(nf.format(12345) + " ");
        nf.setMinimumFractionDigits(3);
        System.out.println(nf.format(1234.5));
    }
}
