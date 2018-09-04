package com.lee.designpattern.construction.singleton;

/**
 * @package: com.lee.designpattern.singleton
 * @ClassName: Singleton3
 * @Description: 双重检索单例
 * @author: liting
 * @date: 2018-01-26 11:24
 */
public class Singleton3 {

    private static Singleton3 instance;

    private Singleton3() {
    }

    /**
     * 3、对外提供获取实例的方法
     * 但是同步的时候将锁放到第一次获取实例的时候，这样的好处就是只有第一次会同步。效率高
     * @return
     */
    public static Singleton3 getInstance() {
        if (instance == null ) {
            Singleton3 s3;
            synchronized (Singleton3.class) {
                s3 = instance;
                if (s3 == null ) {
                    synchronized (Singleton3.class) {
                        if (s3 == null ) {
                            s3 = new Singleton3();
                        }
                    }
                    instance = s3;
                }
            }
        }
        return instance;
    }

}
