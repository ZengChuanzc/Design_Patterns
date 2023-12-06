package com.zc.patterns.singleton.demo9;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author zengchuan
 * @version 1.0
 * @date 2023/12/5 17:50
 * @description Runtime类就是使用的单例设计模式
 * <p>
 * 标准的饿汉
 * <p>
 * private static final Runtime currentRuntime = new Runtime();
 * <p>
 * private static Version version;
 * <p>
 * <p>
 * * Returns the runtime object associated with the current Java application.
 * * Most of the methods of class {@code Runtime} are instance
 * * methods and must be invoked with respect to the current runtime object.
 * *
 * * @return  the {@code Runtime} object associated with the current
 * *          Java application.
 * <p>
 * public static Runtime getRuntime(){
 * return currentRuntime;
 * }
 * <p>
 * /** Don't let anyone else instantiate this class
 * private Runtime(){}
 */
public class Main {
    public static void main(String[] args) throws Exception {

        Runtime runtime = Runtime.getRuntime();
//返回 Java 虚拟机中的内存总量。
        System.out.println(runtime.totalMemory());
//返回 Java 虚拟机试图使用的最大内存量。
        System.out.println(runtime.maxMemory());
//创建一个新的进程执行指定的字符串命令，返回进程对象
        Process process = runtime.exec("ipconfig");
//获取命令执行后的结果，通过输入流获取
        InputStream inputStream = process.getInputStream();
        byte[] arr = new byte[1024 * 1024 * 100];
        int b = inputStream.read(arr);
        System.out.println(new String(arr, 0, b, "gbk"));
    }
}