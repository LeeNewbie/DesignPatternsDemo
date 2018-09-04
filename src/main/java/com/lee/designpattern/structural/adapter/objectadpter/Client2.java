package com.lee.designpattern.structural.adapter.objectadpter;

import com.lee.designpattern.structural.adapter.Adaptee;
import com.lee.designpattern.structural.adapter.Target;

/**
 * @package: com.lee.designpattern.structural.adapter.objectadpter
 * @ClassName: Client2
 * @Description:
 * @author: liting
 * @date: 2018-02-06 15:53
 */
public class Client2 {
    //说话
    public void test1(Target t){
        t.handleReq();
    }
    public static void main(String[] args) {
        Client2 c = new Client2();
        Adaptee a = new Adaptee();
        Target t = new Adapter2(a);//需要传入适配器
        c.test1(t);
    }
}
