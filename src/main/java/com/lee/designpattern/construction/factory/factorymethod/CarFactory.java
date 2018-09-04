package com.lee.designpattern.construction.factory.factorymethod;

import com.lee.designpattern.construction.factory.simplefactory.Car;

/**
 * @package: com.lee.designpattern.factory.factorymethod
 * @ClassName: CarFactory
 * @Description:
 * @author: liting
 * @date: 2018-01-26 15:55
 */
public interface CarFactory {

    public Car creatCar();
}
