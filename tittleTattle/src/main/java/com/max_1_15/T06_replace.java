package com.max_1_15;

/**
 * 描述:
 * ----
 *
 * @author ma.xiaofeng
 * @create 2019-01-18 16:33
 */
public class T06_replace {

    public static void main(String[] args) {

        String string  = "067c0855b0a74d90-8b5a-543e2361ff1e";
        String s = string.replaceAll("-", "");
        System.out.println(s);
        System.out.println(s.length());
    }

}