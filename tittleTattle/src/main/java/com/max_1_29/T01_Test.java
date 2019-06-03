package com.max_1_29;

import java.util.Date;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/**
 * 描述:
 * ----
 *
 * @author ma.xiaofeng
 * @create 2019-01-29 13:42
 */
public class T01_Test {

    public static String getData(Integer integer) throws InterruptedException {
        Thread.sleep(200);
        return new Date().toString()+integer;
    }

    public static void main(String[] args) throws InterruptedException {

        for (int i = 0; i < 10; i++) {

            FutureTask task = new FutureTask(new Callable() {
                @Override
                public Object call() throws Exception {
//                    getData(i);
                    return null;
                }
            });

        }
    }

}