package max_11_8;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 描述:
 * ----
 *      字符串中截取第二个数字
 *
 * @author Administrator
 * @create 2019-12-05 14:38
 */
public class TestStr {

    public static void main(String[] args) {

        String str =" sdf  435  12~234.00vsw   3453466f sdf345  sd23465  4.01x  dsfg 345345";
        Double aDouble = parseContent(str, 1);

        System.out.println(aDouble);

    }


    public static Double parseContent(String content, int index) {

//        if (StringUtils.isBlank(content)) {
//            return null;
//        }

        Pattern pattern = Pattern.compile("(\\d+(\\.\\d+)?)");
        Matcher matcher = pattern.matcher(content);
        int tarInt = 0;
        while (matcher.find()) {
            tarInt ++;
            if (tarInt == index) {
                return Double.valueOf(matcher.group(0));
            }
        }
        return null;
    }
}