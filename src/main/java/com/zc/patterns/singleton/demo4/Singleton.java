package com.zc.patterns.singleton.demo4;

/**
 * @author zengchuan
 * @version 1.0
 * @date 2023/12/6 10:21
 * @description Singleton
 *
 * 懒汉：双重检查锁
 *
 * 由于getInstance是读操作  instance = new Singleton()是写操作，
 * 读操作是线程安全的  而写操作可能产生线程不安全
 * 没有必要每个读操作都加锁 会降低性能
 * 所以引申出双重检查锁的概念
 */
public class Singleton {


    private Singleton() {}

    //由于jvm实例化对象时候，会进行优化和指令重排序操作，导致可能会出现NullPointException
//    private static Singleton instance;

    //使用volatile关键字 保证可见性和有序性
    private static volatile Singleton instance;


    public static Singleton getInstance() {
        //第一次判断 不为null 不加锁 直接返回实例
        if (null == instance) {
            //若为null 则加锁 保证创建时只能由一个线程创建，避免不安全
            synchronized (Singleton.class) {
                //抢到锁之后再次判断是否为null
                if (null == instance) {
                    instance = new Singleton();
                }
            }
        }

        return instance;

    }



}
