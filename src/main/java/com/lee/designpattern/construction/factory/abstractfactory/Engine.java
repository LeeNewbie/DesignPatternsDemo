package com.lee.designpattern.construction.factory.abstractfactory;

/**
 * @package: com.lee.designpattern.factory.abstractfactory
 * @ClassName: Engine
 * @Description:
 * @author: liting
 * @date: 2018-01-26 16:17
 */
public interface Engine {

    void run();

    void start();

}

//好的发动机
class LuxuryEngine implements Engine {
    @Override
    public void run() {
        System.out.println("好发动机转的快");
    }

    @Override
    public void start() {
        System.out.println("启动快，自动启停");
    }
}

//差的发动机
class LowEngine implements Engine {
    @Override
    public void run() {
        System.out.println("转的慢");
    }

    @Override
    public void start() {
        System.out.println("启动慢");
    }
}