package com.lee.designpattern.structural.adapter.objectadpter;

import com.lee.designpattern.structural.adapter.Adaptee;
import com.lee.designpattern.structural.adapter.Target;

/**
 * @package: com.lee.designpattern.structural.adapter.objectadpter
 * @ClassName: Adapter2
 * @Description:
 * @author: liting
 * @date: 2018-02-06 15:51
 */
public class Adapter2 implements Target {

    /**
     * 这里需要和被适配对象关联起来：1.继承   2.组合(推荐)
     * 这里使用组合
     */
    private Adaptee adaptee;

    @Override
    public void handleReq() {
        adaptee.request();
    }

    public Adapter2(Adaptee adaptee) {//在构造器中构造被适配的对象
        super();
        this.adaptee = adaptee;
    }
}
