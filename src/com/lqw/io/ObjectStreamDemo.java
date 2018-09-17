package com.lqw.io;


import java.io.*;

/**
 * 序列化和反序列化对象
 * 2018/09/17
 * Author:lqw
 */


public class ObjectStreamDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        write();
        read();
    }

    //反序列化
    private static void read() throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("test"+File.separator+"student.txt"));
        Student student = (Student)ois.readObject();
        System.out.println(student);
    }

    //序列化
    public static void write() throws IOException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("test"+ File.separator+"student.txt"));
        Student student = new Student("liu");
        oos.writeObject(student);
        oos.close();
    }
}
