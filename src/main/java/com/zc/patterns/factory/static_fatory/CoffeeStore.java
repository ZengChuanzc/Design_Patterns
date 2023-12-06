package com.zc.patterns.factory.static_fatory;

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
        //与具体业务对象不做关联 交给工厂去生产  实现解耦
        /*SimpleCoffeeFatory simpleCoffeeFatory = new SimpleCoffeeFatory();
        Coffee coffee = simpleCoffeeFatory.createCoffee(type);*/
        Coffee coffee = SimpleCoffeeFactory.createCoffee(type);
        //添加配料
        coffee.addMilk();
        coffee.addSugar();
        return coffee;
    }

}
