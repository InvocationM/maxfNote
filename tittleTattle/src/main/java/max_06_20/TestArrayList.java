package max_06_20;

import max_06_19.Client;

import java.util.ArrayList;
import java.util.List;

/**
 * 描述:
 * ----
 *
 * @author ma.xiaofeng
 * @create 2019-06-20 11:40
 */
public class TestArrayList {

    public static void main(String[] args) {
        Client client = new Client();

        List list = new ArrayList();
        list.add("asd" );
        list.add(23 );
        list.add(client);

        System.out.println(list);

        int[] a = new int[12];


    }

}