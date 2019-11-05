package max_10_11;

/**
 * 描述:
 * ----
 *
 * @author Administrator
 * @create 2019-10-12 11:37
 */
public class VoidClass {

    public static void main(String[] args) {

        Class<Void> voidClass = void.class;
//
//        System.out.println(voidClass.getName());
//        System.out.println(voidClass.getClassLoader());
//        System.out.println(voidClass.getSigners());
//        Integer num1 = 400;
//         int num2 = 400;
//        System.out.println(num1 == num2);
//
//        int a = 200;
//        if (a instanceof Object) {
//
//        }
//
//        boolean assignableFrom = Object.class.isAssignableFrom(int.class);
//        System.out.println(assignableFrom);
//        int a = 10;
//        long b = 10L;
//
//        System.out.println(a == b);
        int zhuan=Integer.parseInt("111");
        int zhuanyi=Integer.valueOf("11111");


    }

    public static Long convert(Object obj) {
        if (obj instanceof Integer) {
            System.out.println("sssssssssssssssssssssssssssss");
        }
        return -1L;
    }

}