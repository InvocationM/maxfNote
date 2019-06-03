package max_5_29;

import java.lang.reflect.Field;

/**
 * 描述:
 * ----测试反射方法，字段set方法，的参数，是不是可以为Class类型
 *
 * @author Administrator
 * @create 2019-05-29 21:31
 */
public class T01_FiledSet {


    public static void main(String[] args) throws IllegalAccessException, NoSuchFieldException, InstantiationException {

        Demo2 demo2 = new Demo2();

        Field[] declaredFields = Demo3.class.getDeclaredFields();
        Field bean = Demo3.class.getDeclaredField("bean");
        bean.setAccessible(true);
        bean.set(demo2.getClass().newInstance(), "111");
//
//        for (Field declaredField : declaredFields) {
//            declaredField.setAccessible(true);
//            declaredField.set(demo2, demo2);
//        }
    }

}