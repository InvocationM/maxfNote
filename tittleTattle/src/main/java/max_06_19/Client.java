package max_06_19;

/**
 * 描述:
 * ----
 *
 * @author ma.xiaofeng
 * @create 2019-06-19 10:53
 */
public class Client {

    public static void main(String[] args) {

        GreetImpl greet = new GreetImpl();
        JdkDynamicProxy jdkDynamicProxy = new JdkDynamicProxy(greet);
        Greet instance = (Greet) jdkDynamicProxy.getInstance();
        instance.method();

    }

}