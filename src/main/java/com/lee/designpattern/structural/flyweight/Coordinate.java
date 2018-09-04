package com.lee.designpattern.structural.flyweight;

/**
 * @package: com.lee.designpattern.structural.flyweight
 * @ClassName: Coordinate
 * @Description:
 * @author: liting
 * @date: 2018-02-08 11:31
 */
/**
 * 坐标类（外部状态）：棋子位置
 * UnsharedConcreteFlyWeight（非共享享元类）：不能被共享的子类可以设计为非共享享元类
 */
public class Coordinate {
    private int x,y;//坐标位置
    public Coordinate(int x, int y) {
        super();
        this.x = x;
        this.y = y;
    }
    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }
    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }
}
