package com.max_5_16;

import java.util.HashMap;
import java.util.Map;

/**
 * 描述:
 * ----测试int调用object的equals方法，Object类型和基本数据类型的关系
 *
 * @author Administrator
 * @create 2019-05-16 21:30
 */
public class T01_IntEquals {

    public static void main(String[] args) {

        int num = 19;
        Integer num2  = 23;

        T01_IntEquals t1 = new T01_IntEquals();
        Map map = new HashMap();
        map.put(t1, "111");


        System.out.println();
    }

}