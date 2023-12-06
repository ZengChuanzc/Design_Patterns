package com.zc.patterns.singleton.demo3;

/**
 * @author zengchuan
 * @version 1.0
 * @date 2023/12/6 10:01
 * @description Singleton
 *
 * 懒汉式1： 线程不安全
 */
public class Singleton {

    private Singleton() {}


    private static Singleton instance;

    /**
     * 线程不安全
     * @return
     */
    /*public static Singleton getInstance() {
        //判断是否为null 为null则创建，不为null直接返回，保证不会每次调用重新创建对象
        if (null == instance) {
            //问题： 当多线程场景下  线程1进入到这个地方，并等待，没有进行new操作
            // 当线程2拿到cpu的执行权时 也进入代码的时候  也判断为null 也进入到这个地方
            // 这个时候线程1和线程2都new了一个对象  那么就不是单例了 线程不安全
            instance = new Singleton();
        }
        return instance;
    }*/

    /**
     * 线程安全 加同步锁
     * @return
     */
    public static synchronized Singleton getInstance() {
        //判断是否为null 为null则创建，不为null直接返回，保证不会每次调用重新创建对象
        if (null == instance) {
            //由于线程1已经获取锁 但未释放， 此时线程2是进不来的 只能等待线程1锁释放，synchronized 保证了线程安全
            instance = new Singleton();
        }
        return instance;
    }

}
