package com.zc.patterns.factory.static_fatory;

/**
 * @author zengchuan
 * @version 1.0
 * @date 2023/12/6 15:37
 * @description SimpleCoffeeFactory
 */
public class SimpleCoffeeFactory {


    public static Coffee createCoffee(String type) {
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
