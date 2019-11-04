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

        System.out.println(voidClass.getName());
        System.out.println(voidClass.getClassLoader());
        System.out.println(voidClass.getSigners());
    }

}