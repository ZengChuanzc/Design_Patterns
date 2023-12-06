package com.zc.patterns.singleton.demo8;

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

    //创建一个flag判断标志，用来判断反射进来时是否第一次新建对象
    private static boolean flag = false;
    private Singleton() {

        //增加同步代码块，保证线程安全
        synchronized (Singleton.class) {
            //若为true 则代表是二次新建对象
            if (flag) {
                throw new RuntimeException("不能多次创建对象");
            }
            //若不是  则设置true
            flag = true;
        }
    }

    //创建静态内部类
    private static class SingletonHolder {
        private static final Singleton INSTANCE = new Singleton();
    }

    //提供对外访问方式
    public static Singleton  getInstance() {
        return SingletonHolder.INSTANCE;
    }
}
