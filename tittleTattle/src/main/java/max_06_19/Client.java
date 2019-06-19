package max_06_19;

/**
 * 描述:
 * ----
 *
 * @author ma.xiaofeng
 * @create 2019-06-19 10:53
 */
public class Client {

    public static void main(String[] args) throws Exception{
//
        GreetImpl greet = new GreetImpl();
        JdkDynamicProxy jdkDynamicProxy = new JdkDynamicProxy(greet);
        Greet instance = (Greet) jdkDynamicProxy.getInstance();
        instance.say();
        System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles","true");
//        Greet instance = new JdkDynamicProxy(new GreetImpl()).getInstance();
//        instance.say();
    }

}