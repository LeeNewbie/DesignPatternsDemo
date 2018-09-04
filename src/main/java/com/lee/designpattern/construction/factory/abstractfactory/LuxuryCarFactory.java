package com.lee.designpattern.construction.factory.abstractfactory;

/**
 * @package: com.lee.designpattern.factory.abstractfactory
 * @ClassName: LuxuryCarFactory
 * @Description:
 * @author: liting
 * @date: 2018-01-26 16:20
 */
public class LuxuryCarFactory implements CarFactory2{
    @Override
    public Engine createEngin() {
        return new LuxuryEngine();
    }

    @Override
    public Seat createSeat() {
        return new ASeat();
    }
}
