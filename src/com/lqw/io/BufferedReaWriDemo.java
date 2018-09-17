package com.lqw.io;

import org.junit.Test;

import java.io.*;
import java.util.Arrays;

/**
 * 缓冲字符流
 * 2018/09/17
 * Author:lqw
 */


public class BufferedReaWriDemo {
    @Test
    public void buffTest() throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter("test"+ File.separator+"bw.txt"));
        bw.write("hello");
        bw.newLine();
        bw.write("world");
        bw.flush();


        BufferedReader br = new BufferedReader(new FileReader("test"+File.separator+"bw.txt"));
        String line;
        while ((line = br.readLine())!=null){
            System.out.println(line);
        }

        bw.close();
        br.close();

    }
}
