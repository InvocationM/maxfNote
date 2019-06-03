package com.max_1_15;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * 描述:
 * ----
 *
 * @author ma.xiaofeng
 * @create 2019-01-18 14:26
 */
public class T05_Calendar {

    public static void main(String[] args) {

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());

        for (int i = 0; i < 365; i++) {

            calendar.add(Calendar.DATE, -1);
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String day = sdf.format(calendar.getTime());

            System.out.println(day);
        }
    }

}