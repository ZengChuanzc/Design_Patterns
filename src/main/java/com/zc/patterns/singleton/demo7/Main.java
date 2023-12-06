package com.zc.patterns.singleton.demo7;

import java.io.*;

/**
 * @author zengchuan
 * @version 1.0
 * @date 2023/12/6 11:03
 * @description Main
 *
 * 利用序列化破坏静态内部类的单例
 *
 * 由于ObjectInputStream的readObject里面 调用时，若没有写readResolve  会重新new一个实例
 * 解决序列化破坏单例的方式 写readResolve方法并把单例对象返回
 *
 */
public class Main {

    public static void main(String[] args) throws Exception {

        //往文件写对象
//        writeObjectFile();
        //往文件读对象
        System.out.println(readObjectFromFile());
        System.out.println(readObjectFromFile());
    }

    public static Singleton readObjectFromFile() throws Exception{

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("D:\\00000学习\\test.txt"));
        Singleton instance = (Singleton) ois.readObject();
        ois.close();
        return instance;
    }


    /**
     * 往文件写对象
     * @throws Exception
     */
    public static void writeObjectFile() throws Exception {
        //获取Singleton对象
        Singleton instance = Singleton.getInstance();
        //创建对象输出流
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("D:\\00000学习\\test.txt"));
        objectOutputStream.writeObject(instance);

        objectOutputStream.close();
    }

}
