package com.lee.designpattern.behabior.templatemethod;

/**
 * @package: com.lee.designpattern.behabior.templatemethod
 * @ClassName: AbstractBankTemplateMethod
 * @Description: 模板抽象方法
 * @author: liting
 * @date: 2018-01-30 9:26
 */
public abstract class AbstractBankTemplateMethod {
    /**
     * 模板方法中其他业务逻辑
     * 取号排队
     */
    public void takeNumber() {
        System.out.println("取号排队");
    }

    /**
     * 办理具体的业务：这里留给子类来实现！！！
     */
    public abstract void transact();

    /**
     * 给客服评分
     */
    public void evaluate() {
        System.out.println("反馈评分");
    }

    /**
     * 模板方法
     */
    public final void process() {
        this.takeNumber();
        this.transact();//这里则是具体的模板方法函数
        this.evaluate();
    }
}
