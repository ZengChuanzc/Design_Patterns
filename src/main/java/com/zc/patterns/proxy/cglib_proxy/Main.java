package com.zc.patterns.proxy.cglib_proxy;

/**
 * @author zengchuan
 * @version 1.0
 * @date 2023/12/7 12:02
 * @description Main
 *
 *  Java 9 及更新版本中，java.lang.reflect.AccessibleObject 类的 checkCanSetAccessible 方法在未打开 java.lang 包的情况下，
 *  无法通过反射设置 Accessible 标志。在你的异常栈信息中，net.sf.cglib.core.ReflectUtils 类的初始化（<clinit>）中调用了这个方法，从而导致了异常。
 *
 * 解决方案是在运行时通过 JVM 参数打开 java.lang 包。你可以在启动应用程序时添加以下 JVM 参数：
 * --add-opens java.base/java.lang=ALL-UNNAMED
 *
 * 这个参数的含义是打开 java.lang 包，允许所有未命名的模块访问。请确保你的 Java 运行时环境支持这个参数。在一些较旧的版本中，可能需要考虑升级到支持这个参数的版本。
 *
 * 如果你使用的是 Spring Boot，可以在 application.properties 或 application.yml 文件中添加以下配置：
 * spring.main.allow-bean-definition-overriding=true
 * 这个配置的目的是允许 Spring Boot 重复定义 Bean，这在一些情况下可能有助于解决这个问题。
 *
 */
public class Main {

    public static void main(String[] args) {

        ProxyFactory proxyFactory = new ProxyFactory();
        TrainStation proxyObject = proxyFactory.getProxyObject();
        proxyObject.sell();

    }
}
