package com.zc.patterns.singleton.demo5;

/**
 * @author zengchuan
 * @version 1.0
 * @date 2023/12/6 10:54
 * @description Main
 */
public class Main {

    public static void main(String[] args) {
        Singleton instance1 = Singleton.getInstance();

        Singleton instance2 = Singleton.getInstance();

        System.out.println(instance1 == instance2);
    }

}
