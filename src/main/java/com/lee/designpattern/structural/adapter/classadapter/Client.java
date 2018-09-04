package com.lee.designpattern.structural.adapter.classadapter;

import com.lee.designpattern.structural.adapter.Adaptee;
import com.lee.designpattern.structural.adapter.Target;

/**
 * @package: com.lee.designpattern.structural.adapter.classadapter
 * @ClassName: Client
 * @Description:
 * @author: liting
 * @date: 2018-02-06 15:20
 */
public class Client {
    //说话
    public void test1(Target t) {
        t.handleReq();
    }

    public static void main(String[] args) {
        Client c = new Client();
        Adaptee a = new Adaptee();
        Target t = new Adapter();
        c.test1(t);
    }
}
