package com.zc.patterns.factory.before;

/**
 * @author zengchuan
 * @version 1.0
 * @date 2023/12/6 15:25
 * @description Main
 */
public class Main {

    public static void main(String[] args) {
        CoffeeStore coffeeStore = new CoffeeStore();
        Coffee coffee = coffeeStore.orderCoffee("latte");
        System.out.println(coffee.getName());
    }
}
