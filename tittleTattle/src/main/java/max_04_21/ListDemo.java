package max_04_21;

import java.util.Arrays;
import java.util.List;

/**
 * 描述:
 * ----
 *      测试list在foreach的时候，是否有序
 * @author Administrator
 * @create 2020-05-12 19:00
 */
public class ListDemo {

    public static void main(String[] args) {

        String fields = "aaa, bbbb,  cccc , dddd,  eeee";

        List<String> fieldsList = Arrays.asList(fields.split(","));

        for (String var : fieldsList) {

            System.out.println(var);
        }
    }

}