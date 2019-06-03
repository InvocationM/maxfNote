package com.max_1_15;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * 描述:
 * ----测试 Calendar
 *
 * @author ma.xiaofeng
 * @create 2019-01-15 10:45
 */
public class T01_Calendar {




    public static void main(String[] args) {

        Calendar lastYear = Calendar.getInstance();

        lastYear.setTime(new Date());

        for (int i = 0; i < 365; i++) {
            lastYear.add(Calendar.DATE, -1);
            Date time = lastYear.getTime();

            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String format = sdf.format(time);

            System.out.println(format);

        }
    }

}