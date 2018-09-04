package com.lee.designpattern.construction.builder;

/**
 * @package: com.lee.designpattern.builder
 * @ClassName: AirShip
 * @Description:
 * @author: liting
 * @date: 2018-01-29 9:55
 */
/**
 * 宇宙飞船
 */
public class AirShip {
    private OrbitalModule orbitalModule;//轨道舱
    private Engine engine;//发动机
    private EscapeTower escapeTower;//逃逸塔
    //省略get，set，构造器

    public OrbitalModule getOrbitalModule() {
        return orbitalModule;
    }

    public void setOrbitalModule(OrbitalModule orbitalModule) {
        this.orbitalModule = orbitalModule;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public EscapeTower getEscapeTower() {
        return escapeTower;
    }

    public void setEscapeTower(EscapeTower escapeTower) {
        this.escapeTower = escapeTower;
    }
}
//轨道舱
class OrbitalModule{
    private String name;
    //省略get，set，构造器

    public OrbitalModule(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
//发动机
class Engine{
    private String name;
    //省略get，set，构造器

    public Engine(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
//逃逸塔
class EscapeTower{
    private String name;
    //省略get，set，构造器

    public EscapeTower(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
