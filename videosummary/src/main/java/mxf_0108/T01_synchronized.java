package mxf_0108;

/**
 * 描述:
 * ----synchronized
 *
 * @author Administrator
 * @create 2019-01-08 23:03
 */
public class T01_synchronized {

    private int count = 0;
    private Object object = new Object();

    public void m(){

        synchronized (object) {
            count--;
            System.out.println( Thread.currentThread().getName() + " count =" + count);
        }
    }

}