package com.zc.patterns.factory.static_fatory;


/**
 * @author zengchuan
 * @version 1.0
 * @date 2023/12/6 15:40
 * @description Main
 */
public class Main {


    public static void main(String[] args) {
        CoffeeStore coffeeStore = new CoffeeStore();
        Coffee latte = coffeeStore.orderCoffee("american");
        System.out.println(latte.getName());
    }


}
