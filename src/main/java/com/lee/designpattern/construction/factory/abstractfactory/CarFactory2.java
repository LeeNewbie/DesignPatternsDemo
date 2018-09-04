package com.lee.designpattern.construction.factory.abstractfactory;

/**
 * @package: com.lee.designpattern.factory.abstractfactory
 * @ClassName: CarFactory2
 * @Description:
 * @author: liting
 * @date: 2018-01-26 16:19
 */
public interface CarFactory2 {
    Engine createEngin();
    Seat createSeat();
}
