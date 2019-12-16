package max_11_8;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * 描述:
 * ----
 *      测试   近三个月，没有通话的天数
 * @author Administrator
 * @create 2019-12-05 17:10
 */
public class DaysIn3M {

    public static void main(String[] args) {
        Set<LocalDate> set = new LinkedHashSet<>();
        set.add(LocalDate.now());
        set.add(LocalDate.now());
        set.add(LocalDate.now().minusDays(1));
        set.add(LocalDate.now().plusDays(1));
        set.add(LocalDate.now().minusDays(2));
        set.add(LocalDate.now().minusMonths(1));
        set.add(LocalDate.now().minusMonths(3));
        set.add(LocalDate.now().minusMonths(3).minusDays(1));
        set.add(LocalDate.now().minusMonths(3).plusDays(1));

        int i = daysWithNoCallRecent3M(set);
        int j = daysWithNoCallRecent3M2(set);
        System.out.println(i);

        System.out.println(91-4);

        System.out.println(j);
    }
    // 近三个月中没有过拨打记录的天数
    public static int daysWithNoCallRecent3M(Set<LocalDate> localDateSet) {

        // 近三个月多少天？
        LocalDate minusMonths = LocalDate.now().minusMonths(3);
        long daysIn3Month = minusMonths.until(LocalDate.now(), ChronoUnit.DAYS);

        // 遍历近三个月
        while (!minusMonths.isEqual(LocalDate.now().plusDays(1))){
            // 判断是否在set中，在就说明那一天有拨打记录，则总天数减1
            if (localDateSet.contains(minusMonths)) {
                daysIn3Month--;
            }
            minusMonths = minusMonths.plusDays(1);

        }
        // 返回剩下的天数
        return  new Long(daysIn3Month).intValue();
    }


    // 思路2 遍历集合。 在近三个月日期中，就加1。然后用总天数减
    public static int daysWithNoCallRecent3M2(Set<LocalDate> localDateSet) {

        // 近三个月多少天？
        LocalDate minusMonths = LocalDate.now().minusMonths(3);
        long daysIn3Month = minusMonths.until(LocalDate.now(), ChronoUnit.DAYS);

        int tempDays = 0;
        // 思路2 遍历集合。 在近三个月日期中，就加1。然后用总天数减
        for (LocalDate localDate : localDateSet) {
            if (localDate.isAfter(minusMonths.minusDays(1)) && localDate.isBefore(LocalDate.now().plusDays(1))) {
                tempDays++;
            }
        }

        // 返回剩下的天数
        return  new Long(daysIn3Month - tempDays).intValue();
    }

}