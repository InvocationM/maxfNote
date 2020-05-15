package max_04_21;

/**
 * 描述:
 * ----测试泰文转小写，啥情况
 *
 * @author Administrator
 * @create 2020-04-21 10:36
 */
public class LowerCase {

    public static void main(String[] args) {
        String tai = "网易云音乐Raffle";

        String s = tai.toLowerCase();

        System.out.println(s);



        System.out.println(tai == s);
    }

}