package com.max_4_18;

/**
 * 描述:
 * ----
 *
 * @author ma.xiaofeng
 * @create 2019-04-18 11:02
 */
public class T03_test implements T01_interface,T02_interface{



    public static void main(String[] args) {

        T03_test t1 = new T03_test();
        t1.method();

    }

    @Override
    public void method() {
        System.out.println("2333");
    }
}