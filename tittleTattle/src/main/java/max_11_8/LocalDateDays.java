package max_11_8;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 * 描述:
 * ----
 *      测试 LocalDate 常用api
 * @author Administrator
 * @create 2019-12-05 16:29
 */
public class LocalDateDays {

    public static void main(String[] args) {

        long l = LocalDate.now().toEpochDay();
        LocalDate localDate = LocalDate.now().minusMonths(3);
        long a = localDate.toEpochDay()  - l ;

        // tianshu
        long until = localDate.until(LocalDate.now(), ChronoUnit.DAYS);

        System.out.println(a);
        System.out.println(until);

        LocalDate minusMonths = LocalDate.now().minusMonths(3);
        long daysIn3Month = minusMonths.until(LocalDate.now(), ChronoUnit.DAYS);

        System.out.println(daysIn3Month);
    }

}