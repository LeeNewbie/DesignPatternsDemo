package com.lee.designpattern.behabior.mediator;

/**
 * @package: com.lee.designpattern.behabior.mediator
 * @ClassName: Finacial
 * @Description:
 * @author: liting
 * @date: 2018-02-01 10:03
 */
public class Finacial implements Department {
    private Mediator m;//中介者（总经理）

    //构造的时候将中介者构造进来
    public Finacial(Mediator m) {
        super();
        this.m = m;
        //ConcreteMediator（具体中介者对象）：实现抽象中介者的方法
        //它需要知道所有具体同事类，并从具体同事接收消息，向具体同事对象发出命令。
        m.register("finacial", this);//将当前部门对象注册到中介者对象中，
    }

    @Override
    public void selfAction() {
        System.out.println("财务部：会计正在核对财务......");
    }

    @Override
    public void outAction() {
        System.out.println("财务部向总经理说：钱很多，花不完.....");
    }
}
