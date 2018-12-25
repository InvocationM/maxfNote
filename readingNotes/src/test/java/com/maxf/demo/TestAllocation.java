package com.maxf.demo;

/**
 * 描述:
 * ----测试： 对象优先在eden区分配
 *
 * @author Administrator
 * @create 2018-12-22 11:00
 */
public class TestAllocation {

    private final static int M = 1024* 1024;

    public static void main(String[] args) {
        byte[] allocation1,allocation2,allocation3,allocation4;
        allocation1 = new byte[2 * M];
        allocation2 = new byte[2 * M];
        allocation3 = new byte[2 * M];
        allocation4 = new byte[6 * M];

    }

}