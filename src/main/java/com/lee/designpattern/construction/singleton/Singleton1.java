package com.lee.designpattern.construction.singleton;

/**
 * @package: com.lee.designpattern.singleton
 * @ClassName: Singleton1
 * @Description: 懒汉单例
 * @author: liting
 * @date: 2018-01-26 11:18
 */
public class Singleton1 {

    private static Singleton1 instance = new Singleton1();

    /**
     * @return
     */
    public static Singleton1 getInstance() {
        return instance;
    }

}
