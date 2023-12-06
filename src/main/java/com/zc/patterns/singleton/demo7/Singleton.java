package com.zc.patterns.singleton.demo7;

import java.io.Serializable;

/**
 * @author zengchuan
 * @version 1.0
 * @date 2023/12/6 10:51
 * @description Singleton
 *
 * 懒汉式：静态内部类
 * jvm类加载时候 只会加载外部类  是不会加载静态内部类的
 * 只有内部类的属性/方法被调用时才会被加载, 并初始化其静态属性
 * 利用此特性，可以使用静态内部类的方式 并且不用锁操作
 *
 *
 *
 * 第一次加载Singleton类时不会去初始化INSTANCE，只有第一次调用getInstance，虚拟机加载SingletonHolder
 * 并初始化INSTANCE，这样不仅能确保线程安全，也能保证 Singleton 类的唯一性。
 *
 */
public class Singleton implements Serializable {

    private Singleton() {}

    //创建静态内部类
    private static class SingletonHolder {
        private static final Singleton INSTANCE = new Singleton();
    }

    //提供对外访问方式
    public static Singleton  getInstance() {
        return SingletonHolder.INSTANCE;
    }


    /**
     * 解决序列化反序列化破解单例模式
     * @return Object
     */
    public Object readResolve() {
        return SingletonHolder.INSTANCE;
    }
}
