package com.zc.patterns.proxy.static_proxy;

/**
 * @author zengchuan
 * @version 1.0
 * @date 2023/12/7 10:30
 * @description ProxyPoint
 */
public class ProxyPoint implements SellTickets{


    private TrainStation trainStation = new TrainStation();

    @Override
    public void sell() {
        System.out.println("代理点操作卖票");
        trainStation.sell();
    }
}
