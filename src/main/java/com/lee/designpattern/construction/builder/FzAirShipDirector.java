package com.lee.designpattern.construction.builder;

/**
 * @package: com.lee.designpattern.builder
 * @ClassName: FzAirShipDirector
 * @Description: 创建构建者的引用
 * @author: liting
 * @date: 2018-01-29 10:02
 */
public class FzAirShipDirector implements AirShipDirector {
    /**
     * 创建构建者的引用
     */
    private AirShipBuilder builder;

    public FzAirShipDirector(AirShipBuilder airShipBuilder) {
        this.builder = airShipBuilder;
    }

    /**
     * 组装具体的对象，为了简单，这里的组装步骤比较简单。实际产品中较复杂
     */
    @Override
    public AirShip directorAirShip() {
        Engine e = builder.builderEngine();//构建发动机
        EscapeTower et = builder.builderEscapeTower();//构建逃逸塔
        OrbitalModule o = builder.builderOrbitalModule();//构建轨道舱
        //装配对象
        AirShip ship = new AirShip();
        ship.setEngine(e);
        ship.setEscapeTower(et);
        ship.setOrbitalModule(o);
        return ship;
    }

    public static void main(String[] args) {

        AirShipDirector shipDirector = new FzAirShipDirector(new FzAirShipBuilder());

        AirShip airShip = shipDirector.directorAirShip();//构建对象

//      System.out.println(airShip.getEngine());
    }
}
