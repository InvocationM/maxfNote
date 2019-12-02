package max_11_8;

/**
 * 描述:
 * ----自然日差值的方法
 *
 * @author Administrator
 * @create 2019-11-19 16:55
 */
public class TestDate {

    public static void main(String[] args) {

        String string = "asd|fas||ga||dsg||g";

        String[] split = string.split("\\|\\|");

        for (String s : split) {

            System.out.println(s);
        }

    }
}