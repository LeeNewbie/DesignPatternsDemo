package com.lee.designpattern.construction.singleton;

/**
 * @package: com.lee.designpattern.singleton
 * @ClassName: Singleton4
 * @Description: 静态内部类单例
 * @author: liting
 * @date: 2018-01-26 11:31
 */
public class Singleton4 {

    private Singleton4() {
    }

    /**
     * 2、声明一个静态内部类,在静态内部类内部提供一个外部类的实例（常量，不可改变）
     * 初始化Singleton4 的时候不会初始化SingletonClassInstance，实现了延时加载。并且线程安全
     */
    private static class Singleton4Factory{
        private static final Singleton4 instance = new Singleton4();
    }

    public static Singleton4 getInstance() {
        return Singleton4Factory.instance;
    }
}
