package com.zc.patterns.factory.config_factory;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/**
 * @author zengchuan
 * @version 1.0
 * @date 2023/12/6 17:48
 * @description Main
 */
public class Main {

    public static void main(String[] args) {

        Coffee american = CoffeeFactory.createCoffee("american");
        System.out.println(american.getName());

        Coffee latte = CoffeeFactory.createCoffee("latte");
        System.out.println(latte.getName());


        //Collection.iterator使用到了工厂方法

        /**
         * Collection抽象工厂类 -> iterator()
         * ArrayList对应的具体工厂类  -> 实现iterator()方法
         *
         * Iterator接口为抽象产品类 -> hasNext()
         *                       -> next()
         *
         * ArrayList对应的具体产品类  -> hasNext()
         *                         -> next()
         */
        /*List<String> list = new ArrayList<>();
        list.add("令狐冲");
        list.add("风清扬");
        list.add("任我行");

        //获取迭代器对象
        Iterator<String> it = list.iterator();
        //使用迭代器遍历
        while(it.hasNext()) {
            String ele = it.next();
            System.out.println(ele);
        }*/
    }

}
