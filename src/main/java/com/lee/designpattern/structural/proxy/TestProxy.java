package com.lee.designpattern.structural.proxy;

import java.lang.reflect.Proxy;

/**
 * @package: com.lee.designpattern.structural.proxy
 * @ClassName: TestProxy
 * @Description:
 * @author: liting
 * @date: 2018-02-08 15:27
 */
public class TestProxy {
    public static void main(String[] args) {
        Star real = new RealStar();
        Star proxy = new ProxyStar(real);
        proxy.confer();
        proxy.signContract();
        proxy.bookTicket();
        //真实对象的操作（明星唱歌）
        proxy.sing();
        proxy.collectMoney();

        System.out.println("***************************");
        //真实角色
        Star realStar = new RealStar();
        //处理器
        StarHandler handler = new StarHandler(realStar);
        //代理类
        Star proxy2 = (Star) Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(), new Class[]{Star.class}, handler);
        proxy2.sing();//调用代理类的唱歌方法：其实调用的是真实角色的唱歌方法
    }
}
