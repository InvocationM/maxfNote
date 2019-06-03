package max_06_01;

/**
 * 描述:
 * ----
 *
 * @author Administrator
 * @create 2019-06-02 9:54
 */
public class Test {

    public static void main(String[] args) {
        Method m1 = new Method();

        System.out.println(" 前置增强");
        m1.method();
        System.out.println(" 后置增强！！");

    }

}