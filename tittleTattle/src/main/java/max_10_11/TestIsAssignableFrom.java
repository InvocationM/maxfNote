package max_10_11;

/**
 * 描述:
 * ----测试
 *      isAssignableFrom（）
 *
 * @author Administrator
 * @create 2019-10-12 14:51
 */
public class TestIsAssignableFrom {

    public static void main(String[] args) {

        String cls = "2222";

        boolean b = String.class.isAssignableFrom(cls.getClass());

        System.out.println(b);
    }

}