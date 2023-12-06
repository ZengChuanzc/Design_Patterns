package com.zc.patterns.factory.simple_factory;


/**
 * @author zengchuan
 * @version 1.0
 * @date 2023/12/6 15:40
 * @description Main
 */
public class Main {


    public static void main(String[] args) {
        CoffeeStore coffeeStore = new CoffeeStore();
        Coffee latte = coffeeStore.orderCoffee("latte");
        System.out.println(latte.getName());
    }


}
