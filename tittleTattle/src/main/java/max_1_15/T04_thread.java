package max_1_15;

/**
 * 描述:
 * ----测试 继承thread的类，能不能直接new然后start，还是必须调用new thread（）
 *
 *      结论  可以直接start
 * @author ma.xiaofeng
 * @create 2019-01-15 16:35
 */
public class T04_thread extends Thread{

    @Override
    public void run() {
        super.run();
        System.out.println(Thread.currentThread().getName());
    }

    public static void main(String[] args) {

        Thread t1 = new T04_thread();
        Thread t2 = new T04_thread();
//        new T04_thread().start();
        new Thread(t1," 123").start();
        new Thread(t1," 234").start();
        new Thread(t2," 123").start();
        new Thread(t2," 234").start();

        System.out.println(Thread.currentThread().getName());


        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Run of Runnable");
                System.out.println(Thread.currentThread().getName());
            }
        }) {
            @Override
            public void run() {
                System.out.println("Run of Thread");
                System.out.println(Thread.currentThread().getName());
                super.run();
            }
        }.start();
    }
}