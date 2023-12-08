package com.zc.patterns.strategy;

/**
 * @author zengchuan
 * @version 1.0
 * @date 2023/12/8 10:36
 * @description SalesMan
 */
public class SalesMan {

    private Strategy strategy;


    public Strategy getStrategy() {
        return strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public SalesMan(Strategy strategy) {
        this.strategy = strategy;
    }

    public void salesManShow() {
        strategy.show();
    }

}
