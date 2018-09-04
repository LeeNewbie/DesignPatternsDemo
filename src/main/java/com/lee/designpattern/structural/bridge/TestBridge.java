package com.lee.designpattern.structural.bridge;

/**
 * @package: com.lee.designpattern.structural.bridge
 * @ClassName: TestBridge
 * @Description:
 * @author: liting
 * @date: 2018-02-06 16:20
 */
public class TestBridge {
    public static void main(String[] args) {
        //销售联想的笔记本
        Computer c = new Laptop(new Lenovo());
        c.sale();

        Computer c2 = new Desktop(new Dell());
        c2.sale();
    }
}
