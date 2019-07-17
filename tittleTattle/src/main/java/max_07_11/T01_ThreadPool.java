package max_07_11;

import java.util.concurrent.*;

/**
 * 描述:
 * ----
 *
 * @author Administrator
 *              测试不同种类的线程池
 *
 *                  使用原生的ThreadPoolExcutor，线程存活时间咋设置？ unit工作线程工厂咋搞？  任务队列到底多大？
 * @create 2019-07-11 23:03
 */
public class T01_ThreadPool {

    public static void main(String... args) {

        ThreadFactory threadFactory = new MyThreadFactory();

        ThreadPoolExecutor executor = new ThreadPoolExecutor(2, 5, 1000, TimeUnit.DAYS,new PriorityBlockingQueue<>(), threadFactory);


        for (int i = 0; i < 10; i++) {

            executor.execute(new MyThread());

        }

        String s = "(.+)";

        System.out.println("nnnnnnnnnnnnnnnnnnnn\n");

    }

}