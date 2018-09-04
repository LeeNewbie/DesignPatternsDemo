package com.lee.designpattern.behabior.strategy;

/**
 * @package: com.lee.designpattern.behabior.strategy
 * @ClassName: Strategy
 * @Description: 抽象算法接口：定义了所有支持算法的公共接口
 * @author: liting
 * @date: 2018-02-02 10:32
 */
public interface Strategy {
    /**
     * 算法方法:打印商品的价格（不同的实现打不同的折扣）
     */
    public double getPrice(double price);
}
