package com.lqw.io;

import org.junit.Test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * 打印流
 * 可以操作任意类型数据
 * 2018/09/17
 * Author:lqw
 */


public class PrintWriterDemo {
    @Test
    public void printTest() throws IOException {
        //创建字符打印流并自动刷新
        PrintWriter pw = new PrintWriter((new FileWriter("test"+ File.separator+"pw.txt")),true);
        pw.println("hello");
        pw.println(100);
        pw.println(true);
        pw.close();

    }

}
