package com.lee.designpattern.structural.proxy;

/**
 * @package: com.lee.designpattern.structural.proxy
 * @ClassName: RealStar
 * @Description: 真实角色（明星艺人）
 * @author: liting
 * @date: 2018-02-08 15:26
 */
public class RealStar implements Star {
    @Override
    public void confer() {
        System.out.println("RealStar.confer()");
    }

    @Override
    public void signContract() {
        System.out.println("RealStar.signContract()");
    }

    @Override
    public void bookTicket() {
        System.out.println("RealStar.bookTicket()");
    }

    @Override
    public void sing() {
        //真实角色的操作：真正的业务逻辑
        System.out.println("张学友.sing()");
    }

    @Override
    public void collectMoney() {
        System.out.println("RealStar.collectMoney()");
    }
}
