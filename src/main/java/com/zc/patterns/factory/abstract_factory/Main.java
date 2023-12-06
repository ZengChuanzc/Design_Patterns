package com.zc.patterns.factory.abstract_factory;

/**
 * @author zengchuan
 * @version 1.0
 * @date 2023/12/6 17:10
 * @description Main
 */
public class Main {

    public static void main(String[] args) {

        //创建意大利风味甜品工厂
//        ItalyDessertFactory factory = new ItalyDessertFactory();
        //创建美式风味甜品工厂
        AmericanDessertFactory factory = new AmericanDessertFactory();
        Coffee coffee = factory.createCoffee();
        Dessert dessert = factory.createDessert();
        System.out.println(coffee.getName());
        dessert.show();

    }
}
