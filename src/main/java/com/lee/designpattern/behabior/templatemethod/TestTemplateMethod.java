package com.lee.designpattern.behabior.templatemethod;

/**
 * @package: com.lee.designpattern.behabior.templatemethod
 * @ClassName: TestTemplateMethod
 * @Description:
 * @author: liting
 * @date: 2018-01-30 9:39
 */
public class TestTemplateMethod {
    public static void main(String[] args) {
        AbstractBankTemplateMethod template = new DrawMoney();
        template.process();
        System.out.println("*********************");
        AbstractBankTemplateMethod template1 = new AbstractBankTemplateMethod() {
            //这里使用匿名内部类实现:只需实现具体业务部分，其他部分则使用模板方法定义好的骨架
            @Override
            public void transact() {
                System.out.println("我要存钱");
            }
        };
        template1.process();
    }

}
