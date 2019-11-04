package max_07_26;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/**
 * 描述:
 * ----
 *
 * @author Administrator
 * @create 2019-08-06 21:26
 *
 *
 *      测试list集合的addAl方法是不是可以添加任何集合
 *
 *              可以。底层直接使用了 new一个新数组，然后系统拷贝。
 */
public class T02_listAddAll {

    public static void main(String[] args) {

        List list = new ArrayList();

        Set set = new LinkedHashSet();

        list.add(set);

        list.addAll(set);

    }

}