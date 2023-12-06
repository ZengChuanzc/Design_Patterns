package com.zc.patterns.factory.factory_method;


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

    private CoffeeFactory coffeeFactory;


    public void setCoffeeStore(CoffeeFactory coffeeFactory) {
        this.coffeeFactory = coffeeFactory;
    }


    public Coffee orderCoffee() {
        Coffee coffee = coffeeFactory.createCoffee();
        coffee.addMilk();
        coffee.addSugar();

        return coffee;
    }

}
