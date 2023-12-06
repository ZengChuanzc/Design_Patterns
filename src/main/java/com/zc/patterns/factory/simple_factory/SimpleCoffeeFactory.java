package com.zc.patterns.factory.simple_factory;

/**
 * @author zengchuan
 * @version 1.0
 * @date 2023/12/6 15:37
 * @description SimpleCoffeeFactory
 */
public class SimpleCoffeeFactory {


    public Coffee createCoffee(String type) {
        Coffee coffee;
        if ("latte".equals(type)) {
            coffee = new LatteCoffee();
        }else if ("american".equals(type)) {
            coffee = new AmericanCoffee();
        }else {
            throw new RuntimeException("没有对应的咖啡");
        }
        return coffee;
    }

}
