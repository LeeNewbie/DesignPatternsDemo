package com.lee.designpattern.construction.factory.simplefactory;

/**
 * @package: com.lee.designpattern.factory.simplefactory
 * @ClassName: CarFactory
 * @Description: 简单工厂模式
 * @author: liting
 * @date: 2018-01-26 15:52
 */
public class CarFactory {
    /**
     * 创建汽车
     *
     * @param type
     * @return
     */
    public static Car createCar(String type) {
        //该方法还会有问题，假如以后有很多汽车都需要工厂来创建。则又得修改源代码，违反了OCP开闭原则
        if ("audi".equals(type)) {
            return new AdCar();
        } else if ("byd".equals(type)) {
            return new BydCar();
        } else {
            return null;
        }
    }
}

//测试简单工厂方法
class TestSimpleFactoryCar {//调用者

    public static void main(String[] args) {
        //创建汽车
        Car audi = CarFactory.createCar("audi");//创建者
        Car byd = CarFactory.createCar("byd");
        audi.run();
        byd.run();
    }


}
