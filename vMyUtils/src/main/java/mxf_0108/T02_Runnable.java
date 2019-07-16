package mxf_0108;

/**
 * 描述:
 * ----
 *
 * @author Administrator
 * @create 2019-01-08 23:18
 */
public class T02_Runnable implements Runnable{

    private int count = 10;

    @Override
    public void run() {
        count--;
        System.out.println(count);
    }

    public static void main(String[] args) {

        T02_Runnable t = new T02_Runnable();
        for (int i = 0; i < 100; i++) {
            new Thread(t, "name = "+ Thread.currentThread().getName()).start();
        }
    }
}