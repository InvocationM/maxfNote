package com.max_5_16;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

/**
 * 描述:
 * ----
 *
 * @author Administrator
 * @create 2019-05-25 22:41
 */
public class MyDemo {

    public void method() {
        System.out.println(" zzzzzzzzzzz");
    }

    public static void main(String[] args) {

        XmlBeanFactory xmlBeanFactory = new XmlBeanFactory(new ClassPathResource("TestBeanFactory.xml"));

        MyDemo demo = (MyDemo) xmlBeanFactory.getBean("demo");

        demo.method();
    }

}