package com.lee.designpattern.behabior.strategy;

/**
 * @package: com.lee.designpattern.behabior.strategy
 * @ClassName: Context
 * @Description:
 * @author: liting
 * @date: 2018-02-02 10:37
 */
public class Context {
    //持有算法族的引用
    private Strategy strategy;

    public Context(Strategy strategy) {
        super();
        this.strategy = strategy;
    }

    //打印价钱
    public void printPrice(double price) {
        System.out.println("应付金额：" + Math.round(strategy.getPrice(price)));
    }
}
