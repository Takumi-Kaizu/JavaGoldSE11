package localize_format;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class Test12_13 {

    public static void main(String[] args) {
        LocalDate xmas = LocalDate.of(2021, 12, 25);
        DayOfWeek xmasday = xmas.getDayOfWeek();
        System.out.println("Christmas day is on " + xmasday);
    }
}
