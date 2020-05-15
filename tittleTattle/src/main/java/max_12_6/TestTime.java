package max_12_6;

/**
 * 描述:
 * ----
 *
 * @author Administrator
 * @create 2020-02-24 15:29
 */
public class TestTime {
    public static void main(String[] args) {

//        for (int i = 100000; i > 0; i--) {
//
//            int i2 = (int)(Math.random() * (100 + 1));
//
//            if (i2 == 100) {
//                System.out.println(i2);
//            }
//            if (i2 == 0) {
//                System.out.println(i2);
//            }
//        }

        String URL = "210.22.173.210";

        String[] split = URL.split("\\.");

        for (String s : split) {
            System.out.println(s);
        }


    }

}