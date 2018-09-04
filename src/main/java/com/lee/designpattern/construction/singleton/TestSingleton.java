package com.lee.designpattern.construction.singleton;

import java.util.concurrent.CountDownLatch;

/**
 * @package: com.lee.designpattern.singleton
 * @ClassName: TestSingleton
 * @Description: 测试
 * @author: liting
 * @date: 2018-01-26 13:31
 */
public class TestSingleton {
    public static void main(String[] args) throws InterruptedException {
        long start = System.currentTimeMillis();
        //10个线程
        int threadNum = 10;
        final CountDownLatch countDownLatch = new CountDownLatch(threadNum);
        for (int i = 0; i < threadNum; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int i = 0; i < 100000; i++) {
//                        Object o = Singleton5.INSTANCE;
                        Singleton3.getInstance();
                    }
                    countDownLatch.countDown();//计数器-1
                }
            }).start();
        }

        countDownLatch.await();//main线程阻塞
        long end = System.currentTimeMillis();
        System.out.println("耗时："+(end-start));

        /**
         * 结果（毫秒）:
         * Singleton1（饿汉式）耗时：5
         * Singleton2（懒汉式）耗时：227
         * Singleton3（双重检索式）耗时：7
         * Singleton4（静态内部类式）耗时：40
         * Singleton5（枚举式）耗时：5
         */
    }
}
