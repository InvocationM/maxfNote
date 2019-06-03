package com.max_3_26;

/**
 * 描述:
 * ----
 *
 * @author ma.xiaofeng
 * @create 2019-04-09 15:20
 */
public class TestSplit {

    public static void main(String[] args) {

        String str = "asdf";
        String[] split = str.split(",");

        for (String string : split) {
            System.out.println(string);
        }

    }

}