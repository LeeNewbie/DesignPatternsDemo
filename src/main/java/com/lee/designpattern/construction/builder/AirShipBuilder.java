package com.lee.designpattern.construction.builder;

/**
 * @package: com.lee.designpattern.builder
 * @ClassName: AirShipBuilder
 * @Description: 构建接口:用来构建AirShipz中组件的接口
 * @author: liting
 * @date: 2018-01-29 9:58
 */
public interface AirShipBuilder {

    Engine builderEngine();//构建发动机

    OrbitalModule builderOrbitalModule();//构建轨道舱

    EscapeTower builderEscapeTower();//构建逃逸塔
}
