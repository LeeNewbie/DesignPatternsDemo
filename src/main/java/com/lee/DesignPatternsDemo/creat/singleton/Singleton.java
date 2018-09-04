package com.lee.DesignPatternsDemo.creat.singleton;

/**
 * @author liting
 * @ClassName：Singleton
 * @Description：单例模式
 * @company:zhph
 * @date 2017年11月29日 上午9:23:26
 */

public class Singleton {
//	private static Singleton instance = null;

    public static Singleton getInstance() {
//		if (instance == null) {
//			synchronized (instance) {
//				if (instance == null) {
//					instance = new Singleton();
//				}
//			}
//		}
//		return instance;
        return SingletonFactory.instance;
    }

    private static class SingletonFactory {
        public static Singleton instance = new Singleton();
    }


    public void read(String word) {
        System.out.println("says " + word);
    }
}
