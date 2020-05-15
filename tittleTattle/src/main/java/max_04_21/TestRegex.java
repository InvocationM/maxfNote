package max_04_21;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 描述:
 * ----测试正则
 *
 * @author Administrator
 * @create 2020-05-06 16:32
 */
public class TestRegex {

    public static void main(String[] args) {

        String content = "ภาระค่าใช้จ่ายบั456￥57泰铢ตรเค00123รดิต042432434239.59泰铢67ขั้นต่ำ2,774.55ชำระ10/12ขออภัย0.12泰铢หากชำระแล้ว";
        // 包含五六位数字的
//        String pattern = ".*\\d\\{5,6\\}\\D\\+.*";
//        String pattern = ".*\\D\\d{5,6}\\D.*";

        // 金额表示
//        String pattern = "([1-9]{1}\\d*[,]?\\d)[泰][铢]";
//        String pattern = "\\D(\\d*)\\D";
        String pattern = "((-)?([1-9]{1}(\\d)*|([0]{1}))(\\.(\\d){1,2})?)[泰][铢]";

//        String pattern = "(([1-9][0-9]{0,2}(,\\d{3})*)|0)(\\.\\d{1,2})?";
//        String pattern = "^[1-9][0-9]$";
//        boolean matches = Pattern.matches(pattern, content);

        Pattern compile = Pattern.compile(pattern);
        Matcher matcher = compile.matcher(content);
        while (matcher.find()) {
////        matcher.find();
////            matcher.start();
            System.out.println(matcher.group(1));
////            String group = ;
//
////        matcher.end();
        }

        boolean matches = Pattern.matches(pattern, content);
        System.out.println(matches);
//        System.out.println(matches);

    }

}