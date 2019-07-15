package max_07_11;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * 描述:
 * ----
 *
 * @author Administrator
 * @create 2019-07-11 23:11
 */
public class MyThreadFactory implements ThreadFactory {


    private AtomicInteger mThreadNum = new AtomicInteger();
    @Override
    public Thread newThread(Runnable r) {
        Thread thread = new Thread(r, "mThread-Name is " + mThreadNum);
        System.out.println(" myThread  has created");
        return thread;
    }
}