package com.lee.DesignPatternsDemo;

import org.junit.Test;

import java.util.concurrent.*;

/**
 * @package: com.lee.DesignPatternsDemo
 * @ClassName: TestDemoFuture
 * @Description:
 * @author: liting
 * @date: 2018-08-07 16:48
 */
public class TestDemoFuture {

    class FutureThread1 implements Callable<String>{
        /**
         * Computes a result, or throws an exception if unable to do so.
         *
         * @return computed result
         * @throws Exception if unable to compute a result
         */
        @Override
        public String call() throws Exception {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return Thread.currentThread().getName();
        }
    }

    class AThread extends Thread{
        private String a;

        public AThread(String a) {
            this.a = a;
        }

        /**
         * When an object implementing interface <code>Runnable</code> is used
         * to create a thread, starting the thread causes the object's
         * <code>run</code> method to be called in that separately executing
         * thread.
         * <p>
         * The general contract of the method <code>run</code> is that it may
         * take any action whatsoever.
         *
         * @see Thread#run()
         */
        @Override
        public void run() {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(a);
        }
    }

    @Test
    public void testFuture() throws Exception {
        ExecutorService service = Executors.newFixedThreadPool(2);
        FutureThread1 thread1 = new TestDemoFuture().new FutureThread1();
        Future<String> future = service.submit(thread1);
        System.out.println(future.get());
    }

    @Test
    public void testJoin() throws Exception {
        AThread a1 = new TestDemoFuture().new AThread("1");
        AThread a2 = new TestDemoFuture().new AThread("2");
        AThread a3 = new TestDemoFuture().new AThread("3");
        a1.start();
        a1.join();
        a2.start();
        a2.join();
        a3.start();
        a3.join();

        Thread.sleep(2000);
        Thread.currentThread().sleep(2000);

    }
}
