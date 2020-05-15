package max_04_21;

import java.util.ArrayList;
import java.util.List;

/**
 * 描述:
 * ----
 *
 * @author Administrator
 * @create 2020-04-29 13:54
 *  list有序，equals比较的时候，是按照索引顺序取出来，一个个比较的。
 */
public class ArrayListEquals {

    public static void main(String[] args) {


        List<String> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        list1.add("1");
        list1.add("2");
        list1.add("3");

        list2.add("2");
        list2.add("1");
        list2.add("3");


        System.out.println(list1.equals(list2));
    }

}