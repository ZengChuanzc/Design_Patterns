package com.zc.patterns.strategy;

/**
 * @author zengchuan
 * @version 1.0
 * @date 2023/12/8 10:28
 * @description StratrgyA
 */
public class StratrgyA implements Strategy{
    @Override
    public void show() {
        System.out.println("满100-10");
    }
}
