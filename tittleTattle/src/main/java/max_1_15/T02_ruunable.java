package max_1_15;

/**
 * 描述:
 * ----
 *
 * @author ma.xiaofeng
 * @create 2019-01-15 15:16
 */
public class T02_ruunable implements Runnable{
    private static int anInt = 0;

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }


    public static void main(String[] args) {




        T02_ruunable t = new T02_ruunable();
        T02_ruunable t5 = new T02_ruunable();

        Thread t1 = new Thread(t, " 线程一");
        Thread t2 = new Thread(t, " 线程一");
        for (int i = 0; i < 10; i++) {
            new Runnable(){

                @Override
                public void run() {
                    System.out.println(111111111);
                    System.out.println(Thread.currentThread().getId());
                    System.out.println(Thread.currentThread().getThreadGroup());
                    System.out.println(Thread.currentThread().getName());
                }
            }.run();
        }

    }
}