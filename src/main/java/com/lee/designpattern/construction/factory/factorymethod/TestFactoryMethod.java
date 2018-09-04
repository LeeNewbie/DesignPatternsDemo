package com.lee.designpattern.construction.factory.factorymethod;

import com.lee.designpattern.construction.factory.simplefactory.Car;

/**
 * @package: com.lee.designpattern.factory.factorymethod
 * @ClassName: TestFactoryMethod
 * @Description:
 * @author: liting
 * @date: 2018-01-26 15:59
 */
public class TestFactoryMethod {

    public static void main(String[] args) {
        Car byd = new BydCarFactory().creatCar();
        byd.run();
    }
}
