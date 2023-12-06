package com.zc.patterns.factory.before;

/**
 * @author zengchuan
 * @version 1.0
 * @date 2023/12/6 15:22
 * @description CoffeeStore
 *
 * 咖啡店
 *
 */
public class CoffeeStore {


    public Coffee orderCoffee(String type) {
        Coffee coffee = null;
        if ("latte".equals(type)) {
            coffee = new LatteCoffee();
        }else if ("american".equals(type)) {
            coffee = new AmericanCoffee();
        }else {
            throw new RuntimeException("没有对应的咖啡");
        }

        //添加配料
        coffee.addMilk();
        coffee.addSugar();

        return coffee;
    }

}
