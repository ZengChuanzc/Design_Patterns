package com.zc.patterns.factory.abstract_factory;

/**
 * @author zengchuan
 * @version 1.0
 * @date 2023/12/6 17:07
 * @description DessertFactory
 */
public interface DessertFactory {

    Coffee createCoffee();

    Dessert createDessert();
}
