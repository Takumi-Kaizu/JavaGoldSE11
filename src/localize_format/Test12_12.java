package localize_format;

import java.time.LocalDate;
import java.time.Month;

public class Test12_12 {

    public static void main(String[] args) {
        LocalDate christmasDay = LocalDate.of(2021, Month.DECEMBER, 25);
        LocalDate nextDecade = christmasDay.plusYears(10);
        nextDecade.plusDays(15);
        System.out.println(nextDecade);
    }
}
