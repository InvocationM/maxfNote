package max_06_19;

/**
 * 描述:
 * ----
 *          代码中使用泛型
 *
 *          业务代码中，使用aop记录日志
 * @author ma.xiaofeng
 * @create 2019-06-19 17:32
 */
public class Max {

    public static void main(String[] args) {

        Thread t1 = new Thread(){
            @Override
            public void run() {

                System.out.println(Thread.currentThread() == this);
            }
        };

        t1.start();

        System.out.println("");

    }

}