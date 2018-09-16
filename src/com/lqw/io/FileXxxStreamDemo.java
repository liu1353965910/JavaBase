package com.lqw.io;


import org.junit.Test;

import java.io.*;

/**
 * 字节流
 * 2018/09/16
 * Author:lqw
 */


public class FileXxxStreamDemo {
    @Test
    public void fileTest() throws IOException {
        //创建字节输出流对象
        FileOutputStream fos = new FileOutputStream("test"+ File.separator+"fos.txt");
        fos.write("hello".getBytes());
        //释放资源
        fos.close();

        FileInputStream fis = new FileInputStream("test"+File.separator+"fos.txt");
        byte[] bytes = new byte[1024];
        int len = 0;
        while ((len = fis.read(bytes))!=-1){
            System.out.println(new String(bytes,0,len));
        }
        fis.close();
    }

}
