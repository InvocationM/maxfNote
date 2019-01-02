package com.maxf.demo;

/**
 * 描述:
 * ----测试多线程下while
 *
 *      当前线程在while中执行到一半，另外一个线程修改了判断条件。 请问：
 *          此时，当前线程会继续执行下去吗?
 *
 * @author Administrator
 * @create 2019-01-02 20:29
 */
public class WhileTest extends Thread{

    public static int anInt = 0;

    public void run(){

        while (anInt == 0) {
            System.out.println("此时刚进入while");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println(" 沉睡5秒后");
        }
    }

    public void method1() {
        System.out.println("1");
    }

    public static void main(String[] args) {

        int anInt = 0;
        Thread th = new WhileTest();

        Thread t1 = new Thread(th);
        Thread t2 = new Thread(th);

        t1.start();

        t2.start();


    }


}

class  innerClass{
    static int anInt = 0;


}