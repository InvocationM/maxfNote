package max_04_21;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 * 描述:
 * ----
 *
 * @author Administrator
 * @create 2020-05-22 15:47
 */
public class TestMaxLoaclDateTime {

    public static void main(String[] args) {

//        LocalDateTime now = LocalDateTime.now();
//
//        System.out.println("当天的最后时间:  "+ LocalDateTime.of(now.toLocalDate(), LocalTime.MAX));
//
//        LocalDateTime localDateTimeMax = LocalDateTime.of(now.toLocalDate(), LocalTime.MAX);
//
//        Duration duration = Duration.between(now,localDateTimeMax);
//        long days = duration.toDays(); //相差的天数
//        long hours = duration.toHours();//相差的小时数
//        long minutes = duration.toMinutes();//相差的分钟数
//        long millis = duration.toMillis();//相差毫秒数
//        long nanos = duration.toNanos();//相差的纳秒数
//        System.out.println(now);
//        System.out.println(localDateTimeMax);
//        System.out.println("发送短信耗时【 "+days+"天："+hours+" 小时："+minutes+" 分钟："+millis+" 毫秒："+nanos+" 纳秒】");
//
//        LocalDateTime localDateTime = now.plusHours(8);
//        System.out.println(localDateTime);

        LocalDateTime now = LocalDateTime.now();
        LocalDateTime localDateTimeMax = LocalDateTime.of(now.toLocalDate(), LocalTime.MAX);

        Duration duration = Duration.between(now,localDateTimeMax);
        System.out.println(duration.toMillis() / 1000);

        String var = "รู้ยัง..คุณมีสิทธิรับเน็ตฟรี เพิ่มวันละ 2GB ใช้เล่นแอปทรูไอดี\n" +
                "\n" +
                "ดูละครออนไลน์ช่องฮิต\n" +
                "หนังไทย GDH/สหมงคลฟิล์ม\n" +
                "เกมโชว์ รายการตลก\n" +
                "เชียร์บอลไทย/พรีเมียร์ลีค\n" +
                "\n" +
                "ดูวิธีกดรับเน็ตฟรี คลิก bit.ly/2GB_LP";

        System.out.println(var.length());
    }
}