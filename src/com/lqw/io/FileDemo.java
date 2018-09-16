package com.lqw.io;

import org.junit.Test;

import java.io.File;
import java.io.IOException;


/**
 * File类例子
 * 2018/09/16
 * Author:lqw
 */


public class FileDemo {
    @Test
    public void fileTest() throws IOException {
        //创建一个新的目录，如果没存在
        File file = new File("test");
        file.mkdir();

        //如果没有，创建一个新文件
        File file1 = new File("test"+File.separator+"a.txt");
        file1.createNewFile();

        //创建多级目录
        File file2 = new File("test"+File.separator+"demo");
        file2.mkdirs();

        //删除文件或目录
        file2.delete();
    }
}
