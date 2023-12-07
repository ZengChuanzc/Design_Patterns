package com.zc.patterns.proxy.cglib_proxy;


import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author zengchuan
 * @version 1.0
 * @date 2023/12/7 11:56
 * @description ProxyFactory
 */
public class ProxyFactory implements MethodInterceptor {



    private TrainStation trainStation = new TrainStation();

    public TrainStation getProxyObject() {
        //创建cglib中的 Enhancer对象，类似于JDK代理中的Proxy类
        Enhancer enhancer = new Enhancer();
        //设置父类的字节码对象
        enhancer.setSuperclass(TrainStation.class);
        //设置回调函数
        enhancer.setCallback(this);
        //创建代理对象
        TrainStation obj = (TrainStation) enhancer.create();
        return obj;
    }


    /**
     * cglib代理执行的为这个方法
     * @param o             代理对象
     * @param method        真实对象中的方法的Method实例
     * @param args       实际参数
     * @param methodProxy   代理对象中的方法的method实例
     * @return
     * @throws Throwable
     */
    @Override
    public Object intercept(Object o, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        System.out.println("cglib动态代理");
        //通过代理对象去调用方法
        Object obj = method.invoke(trainStation, args);
        return obj;
    }
}
