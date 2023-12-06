package com.zc.patterns.factory.abstract_factory;

/**
 * @author zengchuan
 * @version 1.0
 * @date 2023/12/6 17:08
 * @description AmericanDessertFactory
 */
public class AmericanDessertFactory implements DessertFactory{
    @Override
    public Coffee createCoffee() {
        return new AmericanCoffee();
    }

    @Override
    public Dessert createDessert() {
        return new MatchaMousse();
    }
}
