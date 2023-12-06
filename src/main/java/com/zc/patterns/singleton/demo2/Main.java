package com.zc.patterns.singleton.demo2;

/**
 * @author zengchuan
 * @version 1.0
 * @date 2023/12/6 9:56
 * @description
 *
 * 饿汉试在类加载的时候已经创建，当不使用时会造成内存的浪费
 *
 */
public class Main {

    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();

        Singleton instance1 = Singleton.getInstance();

        System.out.println(instance == instance1);
    }
}
