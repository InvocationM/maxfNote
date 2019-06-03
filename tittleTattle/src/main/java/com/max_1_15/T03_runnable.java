package com.max_1_15;

/**
 * 描述:
 * ----调用new Thread（）构造器才算new了一个线程
 *
 * @author ma.xiaofeng
 * @create 2019-01-15 15:18
 */
public class T03_runnable {

    public static void main(String[] args) {

        System.out.println("1");

        for (int i = 0; i < 10; i++) {

            new Thread(new Runnable() {
                @Override
                public void run() {
                    int i=0;
                    while(true){
                        i++;
                        System.out.println("this is 线程"+i);
                    }
                }
            }, ""+i).start();
        }
    }

}