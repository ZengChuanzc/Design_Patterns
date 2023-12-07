package com.zc.patterns.proxy.static_proxy;

/**
 * @author zengchuan
 * @version 1.0
 * @date 2023/12/7 10:07
 * @description TrainStation
 *
 * 火车站
 */
public class TrainStation implements SellTickets{


    @Override
    public void sell() {
        System.out.println("火车站卖票");
    }
}
