package max_03_10;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.TemporalAdjusters;

/**
 * 描述:
 * ----
 *
 * @author Administrator
 * @create 2020-03-10 15:26
 */
public class LocalDateTimeTest {

    public static void main(String[] args) {

        LocalDateTime today_start = LocalDateTime.of(LocalDate.now(), LocalTime.MIN);
        LocalDateTime today_end = LocalDateTime.of(LocalDate.now(), LocalTime.MAX);

        LocalDateTime date = LocalDateTime.now();
        LocalDateTime firstday = today_start.with(TemporalAdjusters.firstDayOfMonth());
        LocalDateTime lastDay = today_end.with(TemporalAdjusters.lastDayOfMonth());

        System.out.println(today_start);
        System.out.println(today_end);
        System.out.println(firstday);
        System.out.println(lastDay);
    }

}