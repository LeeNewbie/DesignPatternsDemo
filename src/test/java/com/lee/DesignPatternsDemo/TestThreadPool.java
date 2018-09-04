package com.lee.DesignPatternsDemo;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @package: com.lee.DesignPatternsDemo
 * @ClassName: TestThreadPool
 * @Description:
 * @author: liting
 * @date: 2018-07-13 15:02
 */
public class TestThreadPool {

    public static void main(String[] args) {

    }

}

class SpiderThreadPool {

    private ExecutorService pool = Executors.newFixedThreadPool(5);

    private List<Runnable> threadPool = new ArrayList<Runnable>();

    void put(Runnable spiderThread) {
        threadPool.add(spiderThread);
        pool.execute(spiderThread);
    }

    void newWait() throws InterruptedException {
        for (Runnable runnable : threadPool) {
            runnable.wait();
        }
    }

    void newNotify() {
        for (Runnable runnable : threadPool) {
            runnable.notify();
        }
    }


}

class SpiderThread extends Thread{

    /**
     * Allocates a new {@code Thread} object. This constructor has the same
     * effect as {@linkplain #Thread(ThreadGroup, Runnable, String) Thread}
     * {@code (null, null, gname)}, where {@code gname} is a newly generated
     * name. Automatically generated names are of the form
     * {@code "Thread-"+}<i>n</i>, where <i>n</i> is an integer.
     */
    public SpiderThread() {
    }

    /**
     * If this thread was constructed using a separate
     * <code>Runnable</code> run object, then that
     * <code>Runnable</code> object's <code>run</code> method is called;
     * otherwise, this method does nothing and returns.
     * <p>
     * Subclasses of <code>Thread</code> should override this method.
     *
     * @see #start()
     * @see #stop()
     * @see #Thread(ThreadGroup, Runnable, String)
     */
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "wait");
        try {
            Thread.sleep(20000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
