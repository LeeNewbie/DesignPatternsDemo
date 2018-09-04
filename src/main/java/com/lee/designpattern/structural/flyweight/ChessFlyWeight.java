package com.lee.designpattern.structural.flyweight;

/**
 * @package: com.lee.designpattern.structural.flyweight
 * @ClassName: ChessFlyWeight
 * @Description:
 * @author: liting
 * @date: 2018-02-08 11:30
 */
public interface ChessFlyWeight {
    /**
     * 享元类接口：可以共享的有颜色，大小，形状
     * FlyWeight（抽象享元类）：通常是一个接口或者抽象类，声明公共方法，
     * 这些方法可以向外界提供对象的内部状态，设置外部状态。
     */
    //这里只设置一个颜色,大小和形状省略
    void setColor(String c);

    String getColor();

    void display(Coordinate c);//显示棋子
}
