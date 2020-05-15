package max_04_21;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 描述:
 * ----
 *
 * @author Administrator
 * @create 2020-05-07 11:08
 */
public class TestRegex2 {

    public static void main(String[] args) {

        String s = "A876X";
// 把要匹配的字符串写成正则表达式，然后要提取的字符使用括号括起来
// 在这里，我们要提取最后一个数字，正则规则就是“一个数字加上大于等于0个非数字再加上结束符”
        Pattern pattern = Pattern.compile("(\\d)[^\\d]*$");
        Matcher matcher = pattern.matcher(s);
        if(matcher.find())
            System.out.println(matcher.group(0));

    }


}