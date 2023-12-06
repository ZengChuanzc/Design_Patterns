package com.zc.patterns.factory.factory_method;

/**
 * @author zengchuan
 * @version 1.0
 * @date 2023/12/6 16:32
 * @description AmericanCoffeeFactory
 */
public class AmericanCoffeeFactory implements CoffeeFactory{
    @Override
    public Coffee createCoffee() {
        return new AmericanCoffee();
    }
}
