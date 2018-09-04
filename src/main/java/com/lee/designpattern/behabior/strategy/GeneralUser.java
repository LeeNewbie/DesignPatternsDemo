package com.lee.designpattern.behabior.strategy;

/**
 * @package: com.lee.designpattern.behabior.strategy
 * @ClassName: GeneralUser
 * @Description:
 * @author: liting
 * @date: 2018-02-02 10:34
 */
//具体的算法:普通用户，不打折
public class GeneralUser implements Strategy {
    @Override
    public double getPrice(double price) {
        System.out.println("普通用户，不打折");
        return price;
    }
}

//具体的算法:注册用户：打9折
 class RegisterUser implements Strategy {
    @Override
    public double getPrice(double price) {
        System.out.println("注册用户：打9折");
        return price * 0.9;
    }
}

//具体的算法：普通会员：打8折
class RegisterVip implements Strategy {
    @Override
    public double getPrice(double price) {
        System.out.println("普通会员：打8折");
        return price * 0.8;
    }
}

//具体的算法：老会员：打5折
class OldVip implements Strategy {
    @Override
    public double getPrice(double price) {
        System.out.println("老会员：打5折");
        return price * 0.5;
    }
}
