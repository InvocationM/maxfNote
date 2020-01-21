package max_12_6;

import java.util.Objects;

/**
 * 描述:
 * ----测试utils  equals
 *
 * @author Administrator
 * @create 2020-01-21 14:48
 */
public class EqualsTest {


    public static void main(String[] args) {

        String string = "";
        int i = 0;

        boolean equals = Objects.equals(string, i);

        System.out.println(equals);

    }

}