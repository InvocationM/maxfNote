package max_3_26;

import java.io.FileNotFoundException;
import java.lang.reflect.Method;

/**
 * 描述:
 * ---- 测试注解的反射代理，的实现原理
 *      方法： 启动命令行加上     -Dsun.misc.ProxyGenerator.saveGeneratedFiles=true   （用于捕获jdk的动态代理类）
 *
 * @author Administrator
 * @create 2019-03-26 23:29
 */
public class T01_InterfaceHandler {

    @Hello("xxx")
    public static void main(String[] args) throws NoSuchMethodException, FileNotFoundException {

        // 拿到一个类的某个方法的注解
        Class<T01_InterfaceHandler> c1 = T01_InterfaceHandler.class;
        Method main = c1.getMethod("main", String[].class);
        Hello annotation = main.getAnnotation(Hello.class);


    }
}