package com.lee.designpattern.behabior.mediator;

/**
 * @package: com.lee.designpattern.behabior.mediator
 * @ClassName: Development
 * @Description:
 * @author: liting
 * @date: 2018-02-01 10:00
 */
public class Development implements Department{

    private Mediator m;//中介者（总经理）

    //构造的时候将中介者构造进来
    public Development(Mediator m) {
        super();
        this.m = m;
        //ConcreteMediator（具体中介者对象）：实现抽象中介者的方法
        //它需要知道所有具体同事类，并从具体同事接收消息，向具体同事对象发出命令。
        m.register("development", this);//将当前部门对象注册到中介者对象中，
    }

    @Override
    public void selfAction() {
        System.out.println("研发部：正在研发项目......");
    }

    @Override
    public void outAction() {
        System.out.println("研发部向总经理说：项目经费没了.....");
    }
}
