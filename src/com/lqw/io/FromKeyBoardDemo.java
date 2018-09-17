package com.lqw.io;

import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * 从键盘输入数据
 * 2018/09/17
 * Author:lqw
 */


public class FromKeyBoardDemo {
    //第一种方法
    public static void main(String[] arg) throws IOException {
        //通过字符缓冲流包装标准输入流
        //InputStreamReader:可以把标准输入字节流转成字符流
        //第二种方法
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("输入：");
        String line = br.readLine();
        System.out.println("从键盘输入："+line);

        //第三种方法
        Scanner sc = new Scanner(System.in);
        System.out.println("输入：");
        String line1 = sc.nextLine();
        System.out.println("从键盘输入："+line1);

    }

}
