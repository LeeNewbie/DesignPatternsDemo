package com.lee.designpattern.construction.factory.abstractfactory;

/**
 * @package: com.lee.designpattern.factory.abstractfactory
 * @ClassName: TestAbstractFactory
 * @Description:
 * @author: liting
 * @date: 2018-01-26 16:23
 */
public class TestAbstractFactory {
    public static void main(String[] args) {
        ACarFactory a = new ACarFactory();
        a.createEngin().run();
        a.createSeat().sit();


    }
}
