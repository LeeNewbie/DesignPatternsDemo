package com.lee.designpattern.construction.factory.abstractfactory;

/**
 * @package: com.lee.designpattern.factory.abstractfactory
 * @ClassName: Seat
 * @Description:
 * @author: liting
 * @date: 2018-01-26 16:21
 */
public interface Seat {
    void sit();
}

class ASeat implements Seat{

    @Override
    public void sit() {

    }
}

class BSeat implements Seat{

    @Override
    public void sit() {

    }
}