package com.lee.designpattern.construction.factory;

import java.util.Calendar;

/**
 * @package: com.lee.designpattern.factory
 * @ClassName: FactoryUsage
 * @Description:
 * @author: liting
 * @date: 2018-01-26 16:27
 */
public class FactoryUsage {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        Class x = FactoryUsage.class;
        try {
            x.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

    }
}
