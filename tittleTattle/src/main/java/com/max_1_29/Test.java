package com.max_1_29;

/**
 * 描述:
 * ----
 *
 * @author ma.xiaofeng
 * @create 2019-03-07 17:57
 */
public class Test {

    public static void main(String[] args) {
        Test2 test2 = new Test2();
        test2.setAdd("0");
        method1(test2);
    }

    public static void method1(Test2 test2) {

        System.out.println(test2.getAdd() == "0");

    }

}