package com.zc.patterns.singleton.demo2;

/**
 * @author zengchuan
 * @version 1.0
 * @date 2023/12/6 9:52
 * @description Singleton
 *
 * 静态代码块方式
 *
 */
public class Singleton {

    private Singleton() {};

    //声明变量
    private static Singleton instance;

    //静态代码块赋值
    static {
        instance = new Singleton();
    }
    //对外提供获取该类的方法
    public static Singleton getInstance() {
        return instance;
    }
}
