package com.zc.patterns.factory.config_factory;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/**
 * @author zengchuan
 * @version 1.0
 * @date 2023/12/6 17:31
 * @description CoffeeFactory
 */
public class CoffeeFactory {

    private static Map<String, Coffee> map = new HashMap<>();


    //使用静态代码块
    static {
        //创建properties对象
        Properties properties = new Properties();
        //获取配置文件
        Class clazz = CoffeeFactory.class;
        //获取类加载器
        ClassLoader classLoader = clazz.getClassLoader();
        //通过类加载器获取对应的配置文件
        InputStream resourceAsStream = classLoader.getResourceAsStream("bean.properties");


        //加载对应的配置文件
        try {
            properties.load(resourceAsStream);

            Set<Object> keys = properties.keySet();
            for (Object key : keys) {
                String className = (String) properties.get(key);
                //通过反射获取对应的对象
                Class aClass = Class.forName(className);
                Coffee o = (Coffee) aClass.newInstance();
                map.put((String) key, o);
            }


        } catch (Exception e) {
//            throw new RuntimeException(e);
            e.printStackTrace();
        }
    }



    public static Coffee createCoffee(String name) {
        return map.get(name);
    }


}
