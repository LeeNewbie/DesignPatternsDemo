package com.lee.designpattern.construction.factory.simplefactory;

/**
 * @package: com.lee.designpattern.factory.simplefactory
 * @ClassName: BydCar
 * @Description:
 * @author: liting
 * @date: 2018-01-26 15:49
 */
public class BydCar implements Car {
    @Override
    public void run() {
        System.out.println("byd car run");
    }
}
