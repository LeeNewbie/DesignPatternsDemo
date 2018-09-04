package com.lee.designpattern.construction.singleton;

/**
 * @package: com.lee.designpattern.singleton
 * @ClassName: Singleton2
 * @Description: 饿汉单例
 * @author: liting
 * @date: 2018-01-26 11:19
 */
public class Singleton2 {

    private static Singleton2 instance;

    /**
     * 私有化构造器,不对外暴露构造器
     */
    private Singleton2() {

    }

    public static Singleton2 getInstance() {
        if (instance == null) {
            instance = new Singleton2();
        }
        return instance;
    }

}
