package max_11_8;

import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 * 描述:
 * ----
 *      测试  LocalTime的 isBefore方法。
 * @author Administrator
 * @create 2019-12-05 18:14
 */
public class LocalTimeTest {

    public static void main(String[] args) {
        LocalTime now = LocalTime.now();

        // 定义晚上21点    定义早上6点
        LocalTime night21 = LocalTime.of(21, 0).minusNanos(1);
        LocalTime morning6 = LocalTime.of(6, 0).minusNanos(1);
        LocalTime morning5 = LocalTime.of(5, 0).minusNanos(1);

        LocalTime time = LocalTime.parse("12:30:30");
        LocalTime time1 = LocalTime.parse("12:30:30");
        System.out.println(time1.isBefore(time));

        System.out.println(morning5.isAfter(night21));

        LocalDateTime now1 = LocalDateTime.now();

    }

}