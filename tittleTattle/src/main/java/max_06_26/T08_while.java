package max_06_26;

/**
 * 描述:
 * ----
 *      测试while中，调用其他方法，发生异常，会打算这个死循环嘛？
 *
 *      结论： 线程执行中，发生了未捕获的异常，则线程直接进入 terminal状态。
 * @author ma.xiaofeng
 * @create 2019-07-03 15:52
 */
public class T08_while {

    static int anInt = 0;

    public static void main(String[] args) {

        while (true) {
            System.out.println("a");
            method();
        }
    }

    public static void method() {

        anInt++;
        if (anInt == 100) {
            try {
                int b = 0 / 0;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }

}