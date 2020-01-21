package max_12_6;

/**
 * 描述:
 * ----测试构造器对long参数，为什么会调用double的构造器
 *
 * @author Administrator
 * @create 2020-01-06 11:18
 */
public class ParamsTest {

    private String name;
    private String value;

    public ParamsTest(String name, String value) {
        this.name = name;
        this.value = value;
    }
    public ParamsTest(String name, double value) {
        this.name = name;
        this.value = String.valueOf(value);
    }

    public static  void method1(double asd) {

        System.out.println(asd);
    }

    public static void main(String[] args) {

        Long a = 123L;
        ParamsTest sdfsd = new ParamsTest("sdfsd", a);

        System.out.println(sdfsd);


        method1(a);


    }


}