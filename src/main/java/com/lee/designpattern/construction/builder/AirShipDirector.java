package com.lee.designpattern.construction.builder;

/**
 * @package: com.lee.designpattern.builder
 * @ClassName: AirShipDirector
 * @Description: 组装接口:用于将飞船组件组装起来
 * @author: liting
 * @date: 2018-01-29 9:59
 */
public interface AirShipDirector {
    /**
     * 组装飞船
     *
     * @return
     */
    AirShip directorAirShip();
}
