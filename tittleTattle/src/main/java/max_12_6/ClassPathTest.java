package max_12_6;

/**
 * 描述:
 * ----
 *
 * @author Administrator
 * @create 2019-12-06 15:34
 */
public class ClassPathTest {

    public static void main(String[] args) {

        String classpath = System.getenv().get("CLASSPATH");

        System.out.println(classpath);
    }

}