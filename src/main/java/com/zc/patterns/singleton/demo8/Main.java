package com.zc.patterns.singleton.demo8;

import java.lang.reflect.Constructor;

/**
 * @author zengchuan
 * @version 1.0
 * @date 2023/12/6 11:23
 * @description Main
 *
 * 使用反射破坏单例
 *
 *
 * 由于反射获取无参构造时 会新建对象 所以从单例无参构造加手脚去解决被破坏问题
 *
 *
 */
public class Main {


    public static void main(String[] args) throws Exception {

        //获取Singleton 字节码对象
        Class clazz = Singleton.class;
        //获取无参构造方法
        Constructor constructor = clazz.getDeclaredConstructor();
        //取消访问检查
        constructor.setAccessible(true);
        //创建对象
        Singleton instance1 = (Singleton) constructor.newInstance();
        Singleton instance2 = (Singleton) constructor.newInstance();

        System.out.println(instance1 == instance2);

    }

}
