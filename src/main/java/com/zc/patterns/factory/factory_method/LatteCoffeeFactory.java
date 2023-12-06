package com.zc.patterns.factory.factory_method;

/**
 * @author zengchuan
 * @version 1.0
 * @date 2023/12/6 16:31
 * @description LatteCoffeeFactory
 */
public class LatteCoffeeFactory implements CoffeeFactory{


    @Override
    public Coffee createCoffee() {
        return new LatteCoffee();
    }
}
