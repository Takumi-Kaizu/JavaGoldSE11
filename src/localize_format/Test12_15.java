package localize_format;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Test12_15 {

    public static void main(String[] args) {
        LocalTime time = LocalTime.of(0, 00);
        LocalDate date = LocalDate.of(2021, 2, 1);
        LocalDateTime dt = LocalDateTime.of(date, time);
        ZonedDateTime zdt = dt.atZone(ZoneId.of("Asia/Tokyo"));
        Instant instant = zdt.toInstant();
        System.out.println(instant);
    }
    
    public static <T> T method(T t) {
        return t;
    }
}
