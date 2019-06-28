package max_06_26;

import java.util.concurrent.TimeUnit;

/**
 * 描述:
 * ----
 *
 * @author ma.xiaofeng
 * @create 2019-06-28 10:17
 */
public class T04_ThreadNameRule {

    public static void main(String[] args) throws InterruptedException {

        Thread t1 = new Thread(new T1());
        t1.start();

        // 检查异常
        TimeUnit.SECONDS.sleep(10);

        Thread t2 = new Thread(new T2());
        t2.start();

        TimeUnit.SECONDS.sleep(20);

        Thread.State state = t2.getState();
        System.out.println(state);

        // 检查异常
        TimeUnit.SECONDS.sleep(10);

        Thread t3 = new Thread(new T2());
        t3.start();

        for (int i = 0; i < 1000; i++) {
            Thread t4 = new Thread(new T1());
            t4.start();
        }

    }

}