package max_04_21;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 描述:
 * ----
 *
 * @author Administrator
 * @create 2020-05-25 11:06
 */
public class TestRegex3 {

    public static void main(String[] args) {

        String s = "{sdf<8https://www.cnblogs.com/baijinqiang/p/11067033.htmlhkjhkh】76z";

        String var = "(https?|ftp|file)://[-A-Za-z0-9+&@#/%?=~_|!:,.;]+[-A-Za-z0-9+&@#/%=~_|]";

        Pattern pattern = Pattern.compile(var);
        Matcher matcher = pattern.matcher(s);
        if(matcher.find()) {
            System.out.println(matcher.group(0));
        }

        s.replace("", "");

        String sss = "0123456";
        String substring = sss.substring(3);
        System.out.println(substring);

    }
}