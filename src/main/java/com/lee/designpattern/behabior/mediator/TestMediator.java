package com.lee.designpattern.behabior.mediator;

/**
 * @package: com.lee.designpattern.behabior.mediator
 * @ClassName: TestMediator
 * @Description:
 * @author: liting
 * @date: 2018-02-01 10:06
 */
public class TestMediator {
    public static void main(String[] args) {
        Mediator m = new President();//构建中介者对象：总经理
        Market market = new Market(m);//构建市场部
        Finacial finacial = new Finacial(m);
        market.selfAction();
        market.outAction();//市场部和财务部交互
    }
}
