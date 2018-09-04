package com.lee.designpattern.structural.adapter.classadapter;

import com.lee.designpattern.structural.adapter.Adaptee;
import com.lee.designpattern.structural.adapter.Target;

/**
 * @package: com.lee.designpattern.structural.adapter.classadapter
 * @ClassName: Adapter
 * @Description: 具体的适配器的实现（相当于各国的翻译）
 * @author: liting
 * @date: 2018-02-06 15:14
 */
public class Adapter extends Adaptee implements Target {
    /**
     * 这里需要和被适配对象关联起来：1.继承   2.组合(推荐)
     */
//    private Adaptee adaptee;

    @Override
    public void handleReq() {
        super.request();
    }
}
