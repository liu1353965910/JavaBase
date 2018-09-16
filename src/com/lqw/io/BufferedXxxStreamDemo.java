package com.lqw.io;

import org.junit.Test;

import java.io.*;

/**
 * 缓冲字节流
 * 2018/09/16
 * Author:lqw
 */


public class BufferedXxxStreamDemo {
    @Test
    public void buffTest () throws IOException {
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("test"+ File.separator+"bos.txt"));
        bos.write("hello".getBytes());
        bos.close();

        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("test"+File.separator+"bos.txt"));
        byte[] bytes = new byte[1024];
        int len = 0;
        while ((len = bis.read(bytes))!=-1){
            System.out.println(new String(bytes,0,len));
        }
        bis.close();
    }
}
