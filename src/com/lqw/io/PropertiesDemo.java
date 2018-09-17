package com.lqw.io;

import java.io.*;
import java.util.Properties;

/**
 * properties例子
 * 2018/09/17
 * Author:lqw
 */


public class PropertiesDemo {
    public static void main(String[] args) throws IOException {
        store();
        loadPro();
    }

    private static void loadPro() throws IOException {
        Properties pro = new Properties();
        Reader reader = new FileReader("test"+File.separator+"pro.txt");
        pro.load(reader);
        System.out.println("pro:"+pro);
        reader.close();
    }

    private static void store() throws IOException {
        Properties pro = new Properties();
        pro.setProperty("01","Mike");
        pro.setProperty("02","Lily");
        Writer writer = new FileWriter("test"+ File.separator+"pro.txt");
        pro.store(writer,"hello");
        writer.close();
    }
}
