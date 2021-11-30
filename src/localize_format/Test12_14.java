package localize_format;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;

public class Test12_14 {

    public static void main(String[] args) {
        ZonedDateTime departure = ZonedDateTime.of(2021, 1, 1, 3, 0, 0, 0, ZoneId.of("UTC-7"));
        ZonedDateTime arrival = ZonedDateTime.of(2021,  1, 1, 9, 0, 0, 0, ZoneId.of("UTC-9"));
        long hrs = ChronoUnit.HOURS.between(departure, arrival);
        System.out.println("This fight is for " + hrs + "hours");
    }
}
