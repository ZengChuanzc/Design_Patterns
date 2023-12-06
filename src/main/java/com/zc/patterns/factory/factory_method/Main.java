package com.zc.patterns.factory.factory_method;

/**
 * @author zengchuan
 * @version 1.0
 * @date 2023/12/6 16:37
 * @description Main
 */
public class Main {

    public static void main(String[] args) {
        //创建咖啡店对象
        CoffeeStore coffeeStore = new CoffeeStore();
        //创建工厂对象
//        CoffeeFactory coffeeFactory = new AmericanCoffeeFactory();
        CoffeeFactory coffeeFactory = new LatteCoffeeFactory();

        coffeeStore.setCoffeeStore(coffeeFactory);

        Coffee coffee = coffeeStore.orderCoffee();

        System.out.println(coffee.getName());

    }
}
