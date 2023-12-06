package com.zc.patterns.factory.abstract_factory;

/**
 * @author zengchuan
 * @version 1.0
 * @date 2023/12/6 17:09
 * @description ItalyDessertFactory
 */
public class ItalyDessertFactory implements DessertFactory {


    @Override
    public Coffee createCoffee() {
        return new LatteCoffee();
    }

    @Override
    public Dessert createDessert() {
        return new Trimisu();
    }
}
