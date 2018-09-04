package com.lee.designpattern.structural.adapter;

/**
 * @package: com.lee.designpattern.structural.adapter.classadapter
 * @ClassName: Adaptee
 * @Description: 需要被适配的类（各个球员）
 * @author: liting
 * @date: 2018-02-06 15:13
 */
public class Adaptee {
    public void request(){
        System.out.println("请求通过");
    }
}
