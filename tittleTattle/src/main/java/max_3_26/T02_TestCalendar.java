package max_3_26;

import java.util.Calendar;

/**
 * 描述:
 * ----
 *
 * @author ma.xiaofeng
 * @create 2019-04-01 10:40
 */
public class T02_TestCalendar {

    public static void main(String[] args) {

        Calendar todayStart = Calendar.getInstance();
        todayStart.set(Calendar.HOUR_OF_DAY, 0);
        todayStart.set(Calendar.MINUTE, 0);
        todayStart.set(Calendar.SECOND, 0);
        todayStart.set(Calendar.MILLISECOND, 0);
        todayStart.set(Calendar.DATE, -3);

        System.out.println(todayStart.getTime());
    }

}