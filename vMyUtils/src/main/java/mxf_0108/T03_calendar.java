package mxf_0108;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * 描述:
 * ----
 *
 * @author ma.xiaofeng
 * @create 2019-05-07 15:58
 */
public class T03_calendar {

    public static void main(String[] args) {

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());
        calendar.set(Calendar.DATE, calendar.get(Calendar.DATE) - 11);
        Date time = calendar.getTime();
        SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd");
        Date date = new Date();
        String nowTime = sdf.format(time);
        System.out.println(nowTime);
    }

}