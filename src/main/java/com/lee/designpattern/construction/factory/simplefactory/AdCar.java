package com.lee.designpattern.construction.factory.simplefactory;

/**
 * @package: com.lee.designpattern.factory.simplefactory
 * @ClassName: AdCar
 * @Description:
 * @author: liting
 * @date: 2018-01-26 15:49
 */
public class AdCar implements Car {

    @Override
    public void run() {
        System.out.println("audi Car run");
    }
}
