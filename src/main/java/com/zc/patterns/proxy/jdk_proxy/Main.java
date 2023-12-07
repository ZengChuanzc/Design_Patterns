package com.zc.patterns.proxy.jdk_proxy;

/**
 * @author zengchuan
 * @version 1.0
 * @date 2023/12/7 11:14
 * @description Main
 */
public class Main {

    public static void main(String[] args) {
        ProxyFactory proxyFactory = new ProxyFactory();
        SellTickets proxyObject = proxyFactory.getProxyObject();
        proxyObject.sell();
    }
}
