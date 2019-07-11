package Time_Demo;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;

public class LocalDateTimeProvider {
    public static void main(String[] args) {
        ZoneId zoneId;
        LocalDate ld = LocalDate.now();
        LocalDateTime ldt;
        //ZoneId.getAvailableZoneIds().stream().forEach(System.out::println);
        LocalDate ld2 = LocalDate.of(2019,7,1);
        //LocalDate ld3 = ld2.plus(11, ChronoUnit.DAYS);
        LocalDate ld3 = LocalDate.of(2019,10,11);
        System.out.println(ld3);
        Period per = Period.between(ld2,ld3);
        int days = per.getDays();
        System.out.println("Days off " + days );
        DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        System.out.println("Formated date is - " + ld3.format(df));

    }
}
