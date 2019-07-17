package max_07_11;

import java.lang.reflect.InvocationTargetException;

/**
 * 描述:
 * ----
 *
 * @author Administrator
 * @create 2019-07-11 23:54
 */
public class MyThread implements Runnable {

    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        System.out.println("当前线程的名字是--------->>>" + name);

        MyThread t1 = new MyThread();

        Class<? extends MyThread> aClass = t1.getClass();
        try {
            aClass.getConstructor().newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }


    }
}