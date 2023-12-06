package com.zc.patterns.singleton.demo1;

/**
 * @author zengchuan
 * @version 1.0
 * @date 2023/12/6 9:30
 * @description Main
 *
 * 饿汉式-方式1（静态变量方式）
 * 该方式在成员位置声明Singleton类型的静态变量，并创建Singleton类的对象instance。
 * instance对象是随着类的加载而创建的。
 * 如果该对象足够大的话，而一直没有使用就会造成内存的浪费。
 *
 */
public class Main {


    public static void main(String[] args) {
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();

        System.out.println("饿汉式单例 instance1 和 instance2 是否相等:  " + (instance1 == instance2));
    }

}
