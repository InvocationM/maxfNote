package com.max_4_18;


import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.XMLWriter;

import java.io.*;

/**
 * 描述:
 * ----
 *
 * @author ma.xiaofeng
 * @create 2019-04-19 10:22
 */
public class T04_dom4j {

    public static void main(String[] args) {
        Document document = DocumentHelper.createDocument();
        Element bookStore = document.addElement("bookstore");

        Element book= bookStore.addElement("book");
        book.addAttribute("id", "1");

        Element name = book.addElement("name");
        name.setText("小王子");

        String xmlEncoding = document.getXMLEncoding();
        System.out.println(xmlEncoding);
        OutputFormat format = OutputFormat.createPrettyPrint();
        try {
            XMLWriter writer = new XMLWriter(new FileOutputStream(new File("xml/dom4jtest.xml")), format);
            writer.write(document);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}