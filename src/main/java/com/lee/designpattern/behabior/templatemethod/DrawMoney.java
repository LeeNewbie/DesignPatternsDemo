package com.lee.designpattern.behabior.templatemethod;

/**
 * @package: com.lee.designpattern.behabior.templatemethod
 * @ClassName: DrawMoney
 * @Description: //子类实现模板方法：取款
 * @author: liting
 * @date: 2018-01-30 9:37
 */
public class DrawMoney extends AbstractBankTemplateMethod {
    @Override
    public void transact() {
        System.out.println("我要取款");
    }
}
