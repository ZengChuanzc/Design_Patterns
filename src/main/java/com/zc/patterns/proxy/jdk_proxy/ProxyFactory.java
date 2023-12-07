package com.zc.patterns.proxy.jdk_proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author zengchuan
 * @version 1.0
 * @date 2023/12/7 11:01
 * @description ProxyFactory
 *
 *
 * 代理工厂，用来创建代理对象
 */
public class ProxyFactory {

    private TrainStation trainStation = new TrainStation();



    public SellTickets getProxyObject() {


        /** newProxyInstance()参数说明
         * ClassLoader loader,    类加载器，用于加载代理类，使用真实对象的类加载器即可
         * Class<?>[] interfaces, 真实对象所实现的接口，代理模式真实对象和代理对象实现相同的接口
         * InvocationHandler h    代理对象的调用处理程序
         * @return
         */
        SellTickets sellTickets = (SellTickets) Proxy.newProxyInstance(
                trainStation.getClass().getClassLoader(),
                trainStation.getClass().getInterfaces(),
//                new InvocationHandler() {
//                    @Override
//                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
//                        System.out.println("jdk动态代理");
//                        //调用的为这个方法
//                        Object invoke = method.invoke(trainStation, args);
//                        return invoke;
//                    }
//                }
                (proxy, method, args) -> {
                    System.out.println("jdk动态代理");
                    //调用的为这个方法执行真实对象
                    Object invoke = method.invoke(trainStation, args);
                    return invoke;
                }
        );
        return sellTickets;
    }


}
