package max_12_6;

import java.util.function.Function;

/**
 * 描述:
 * ----integer格式化
 *
 * @author Administrator
 * @create 2020-01-02 13:58
 */
public class TestNumberFormat {


    public static void main(String[] args) {

//        String userId =
//                "2318000000";
//
//        String columnLength = "yn_history_gpsProvince_inconsistent_with_baseInfoProvince";
//
//        System.out.println(columnLength.length());
//
//        System.out.println(Integer.MAX_VALUE);
//
//        Integer integer = Integer.valueOf(userId);
//
//        System.out.println(integer);

//        System.out.println(Long.MAX_VALUE);
//        System.out.println(Double.MAX_VALUE);
//        System.out.println(Float.MAX_VALUE);
//        System.out.println(Long.MAX_VALUE);
//
//        long i = 12;
//        String encode = URLEncoder.encode(i, "UTF-8");

      test7();


    }

    public static void test7(){
        Function<Integer,String[]> fun = args -> new String[args];
        String[] strs = fun.apply(6);
        System.out.println(strs.length);

        System.out.println("===等价于===");

        Function<Integer,String[]> fun1 = String[]::new;
        String[] strs1 = fun1.apply(6);
        System.out.println(strs1.length);
    }
}