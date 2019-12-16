package max_12_6;

/**
 * 描述:
 * ----
 *
 * @author Administrator
 * @create 2019-12-12 11:26
 */
public class TestAt {


    public static void main(String[] args) {

        String string = "asfdasg@sdfa";

        String[] split = string.split("@");

        System.out.println(split.length);
        for (int i = 0; i < split.length; i++) {
            System.out.println(split[i]);
        }

        System.out.println(string);
    }
}