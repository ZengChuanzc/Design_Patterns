package com.zc.patterns.singleton.demo6;

/**
 * @author zengchuan
 * @version 1.0
 * @date 2023/12/6 10:58
 * @description Singleton
 *
 * 饿汉：枚举方式
 */
public enum Singleton {
    /**
     * 利用枚举特性，线程安全的，并且只会装载一次 来定义单例，若不考虑内存浪费 这种方式很好
     */
    INSTANCE;
}
