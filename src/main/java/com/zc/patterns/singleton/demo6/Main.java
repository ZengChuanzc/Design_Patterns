package com.zc.patterns.singleton.demo6;


/**
 * @author zengchuan
 * @version 1.0
 * @date 2023/12/6 11:00
 * @description Main
 */
public class Main {

    public static void main(String[] args) {
        Singleton instance1 = Singleton.INSTANCE;

        Singleton instance2 = Singleton.INSTANCE;

        System.out.println(instance1 == instance2);
    }
}
