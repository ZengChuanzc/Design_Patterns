package com.zc.patterns.factory.simple_factory;

/**
 * @author zengchuan
 * @version 1.0
 * @date 2023/12/6 15:13
 * @description Coffee
 */
public abstract class Coffee {



    public abstract String getName();

    /**
     * 加糖
     */
    public void addSugar() {
        System.out.println("加糖");
    }

    /**
     * 加奶
     */
    public void addMilk() {
        System.out.println("加奶");
    }

}
