package com.lee.DesignPatternsDemo;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * @package: com.lee.DesignPatternsDemo
 * @ClassName: TestHashMap
 * @Description:
 * @author: liting
 * @date: 2018-07-05 16:10
 */
public class TestHashMap {
    private Map<String, String> map = new HashMap<String, String>(1000);

    @Test
    public void testHashMap() {
        for (int i = 0; i < 1000; i++) {
            map.put(Integer.toString(i), Integer.toString(i));
        }
//        for (int i = 0; i < 30; i++) {
//            new Thread(new DoGetMapThread("5")).start();
//        }
        for (int i = 100; i < 999; i++) {
            new Thread(new DoPutMapThread(Integer.toString(i), Integer.toString(i))).start();
        }
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(map.size());
    }

    class DoGetMapThread implements Runnable {

        private String key;

        public DoGetMapThread(String key) {
            this.key = key;
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
            System.out.println("Thread:"+Thread.currentThread().getName()+" key:"+map.get(key));
        }
    }

    class DoPutMapThread implements Runnable {

        private String key;
        private String value;

        public DoPutMapThread(String key,String value) {
            this.key = key;
            this.value = value;
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
            map.put(key, value);
            System.out.println("Thread:"+Thread.currentThread().getName()+" key:"+key+" value:" + value);
        }
    }

//    @Test
//    public void testConstrutMap() {
//        int MAXIMUM_CAPACITY = 1 << 30;
//        int cap = 16;
//        int n = cap - 1;
//        n |= n >>> 1;
//        n |= n >>> 2;
//        n |= n >>> 4;
//        n |= n >>> 8;
//        n |= n >>> 16;
//        int x =  (n < 0) ? 1 : (n >= MAXIMUM_CAPACITY) ? MAXIMUM_CAPACITY : n + 1;
//    }


    public static void main(String[] args) {
        int a = 1;
        a++;
        System.out.println(a);
        HashMap map = new HashMap(5);
    }
}
