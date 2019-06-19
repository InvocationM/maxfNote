package max_06_19;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 描述:
 * ----
 *      重点注意： 34行中，method.invoke（）的参数时target，而不是proxy。
 *          总结： 生成了 $proxy0 代理类。 实现了Greet接口。 所以可以强转。
 * @author ma.xiaofeng
 * @create 2019-06-19 10:43
 */
public class JdkDynamicProxy implements InvocationHandler {

    private Object target;

    public void before() {
        System.out.println(" before ");
    }

    public JdkDynamicProxy(Object target) {
        this.target = target;
    }

    @SuppressWarnings("unchecked")
    public  <T> T getInstance() {
        return  (T)Proxy.newProxyInstance(this.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();
        Object invoke = method.invoke(target, args);
        return invoke;
    }


}