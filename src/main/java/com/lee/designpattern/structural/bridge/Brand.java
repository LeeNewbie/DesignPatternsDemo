package com.lee.designpattern.structural.bridge;

/**
 * @package: com.lee.designpattern.structural.bridge
 * @ClassName: Brand
 * @Description: 品牌维度：联想，戴尔，华硕....
 * @author: liting
 * @date: 2018-02-06 16:18
 */

public interface Brand {
    void sale();//销售电脑
}

class Lenovo implements Brand {
    @Override
    public void sale() {
        System.out.println("联想");
    }
}

class Dell implements Brand {
    @Override
    public void sale() {
        System.out.println("戴尔");
    }
}
