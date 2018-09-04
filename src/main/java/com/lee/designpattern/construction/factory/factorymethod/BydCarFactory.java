package com.lee.designpattern.construction.factory.factorymethod;

import com.lee.designpattern.construction.factory.simplefactory.BydCar;
import com.lee.designpattern.construction.factory.simplefactory.Car;

/**
 * @package: com.lee.designpattern.factory.factorymethod
 * @ClassName: BydCarFactory
 * @Description: 工厂方法模式
 * @author: liting
 * @date: 2018-01-26 15:55
 */
public class BydCarFactory implements CarFactory{

    @Override
    public Car creatCar() {
        return new BydCar();
    }
}
