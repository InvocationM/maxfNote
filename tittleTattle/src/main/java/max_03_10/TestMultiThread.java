package max_03_10;

/**
 * 描述:
 * ----测试多线程debug
 *
 * @author Administrator
 * @create 2020-03-31 11:09
 */
public class TestMultiThread {


    public static void main(String[] args) {

        new Thread() {
            @Override
            public void run() {
                A.test();
            }
        }.start();

        new Thread() {
            @Override
            public void run() {
                B.test();
            }
        }.start();
    }

}

class A {

    static {
        int a = 0;
        System.out.println(a);
        B.test();
    }

    public static void test() {
    }
}
class B {

    static {
        int b = 0;
        System.out.println(b);
        A.test();
    }

    public static void test() {
    }
}

