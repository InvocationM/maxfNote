package max_04_21;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.TemporalAdjusters;

/**
 * 描述:
 * ----
 *
 * @author Administrator
 * @create 2020-05-26 15:07
 */
public class TestLocal {

    public static void main(String[] args) {

        LocalTime max = LocalTime.MAX;

        LocalDateTime max1 = LocalDateTime.MAX;

        LocalDate max2 = LocalDate.MAX;

        LocalDateTime now = LocalDateTime.now();
        LocalDateTime lastDay = now.with(TemporalAdjusters.lastDayOfMonth());

        LocalDateTime of = LocalDateTime.of(lastDay.toLocalDate(), LocalTime.MAX);
        System.out.println("11");


        long l = genetateExpireSeconds();
        System.out.println(l);
    }


    public static long genetateExpireSeconds() {
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime lastDay = now.with(TemporalAdjusters.lastDayOfMonth());
        LocalDateTime localDateTimeMax = LocalDateTime.of(lastDay.toLocalDate(), LocalTime.MAX);

        Duration duration = Duration.between(now,localDateTimeMax);
        return duration.toMillis() / 1000;
    }
}