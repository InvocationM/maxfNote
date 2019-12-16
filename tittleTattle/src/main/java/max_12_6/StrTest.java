package max_12_6;

import java.util.ArrayList;
import java.util.List;

/**
 * 描述:
 * ----测试字符串中 相同数字的次数
 *
 * @author Administrator
 * @create 2019-12-10 11:57
 */
public class StrTest {


    public static void main(String[] args) {

        String sss = "223444443544   57568767867";
//        int i = parseSerialNumCount(sss);
//        System.out.println(i);
//        String s = subStr(sss, 17);
//        System.out.println(s);

        sss = "7777777777777777777";

        List<String> subs = getSubs(sss, 0);

        for (String sub : subs) {
            System.out.println(sub);
        }

    }

    //字符串中 连续两个相同的字母或数字的次数。
    public static int parseSerialNumCount(String content) {
//        if (StringUtils.isBlank(content)) {
//            return -1;
//        }
        content = content.trim();

        // 次数
        int count = 0;

        //  临时str
        String temp = "";
        //  相同的字符的值
        String sameStr = "";

        for (int i = 0; i < content.length(); i++) {

            String str = String.valueOf(content.charAt(i));

            // 大于2个相同的字符， 只计算一次
            if (temp.equals(str) && !sameStr.equals(str)) {
                count ++;
                sameStr = str;
                System.out.println("--------------" + sameStr+"---------------");
            }

            // 碰到新的字符就重置 '相同字符的值'
            if (!sameStr.equals(str)) {
                sameStr = "";
            }
            temp = str;
        }
        return count;
    }


    // 字符串中， 连续n个数字相同的次数。 大于n也只计算一次
    public int processNum(String content , int n) {
        content = content.trim();

        char[] chars = content.toCharArray();

        // 截取数组， 长度为 n。
        int startIndex = 0;
        int endIndex = 0;

//        char[] chars1 = Arrays.copyOfRange(chars, startIndex, endIndex + n);
        //
        // 遍历数组range，全部相同，则count+1
        int count = 0;

        for (int i = 0; i < content.length(); i++) {


            for (int j = i; j < i + n; j++) {
                String temp = String.valueOf(content.charAt(j));



            }
        }


        return -1;
    }

    // 从字符串的idx开始，取相同字符的一段
    public static String subStr(String str, int idx) {
        char c = str.charAt(idx);
        StringBuffer result = new StringBuffer();
        result.append(c);
        if(idx < str.length() -1) {
            if(c == str.charAt(idx + 1)) {
                result.append(subStr(str, idx + 1));
            }
        }
        return result.toString();
    }

    // 递归。 查找，
    public static List<String> getSubs(String str, int idx) {
        List<String> result = new ArrayList<>();
        if(str != null) {
            int len = str.length();
            if(len > 0) {
                String sub = subStr(str, idx);
//                System.err.println("sub => " + sub);
                int tLen = sub.length();
                if(tLen > 1) {
                    result.add(sub);
                }
                if(idx < len - 1) {
                    int endIdx = idx + tLen;
                    if(endIdx < len - 1) {
                        result.addAll(getSubs(str, endIdx));
                    }
                }
            }
        }
        return result;
    }


}