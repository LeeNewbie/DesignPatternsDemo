package com.lee.designpattern.behabior.mediator;

/**
 * @package: com.lee.designpattern.behabior.mediator
 * @ClassName: Mediator
 * @Description:
 * @author: liting
 * @date: 2018-02-01 9:59
 */
public interface Mediator {

    void register(String dname, Department d);//将具体的同事类注册到中介者中，让中介者知道所有的同事。以便进行交互

    void command(String dname);//通过部门名称，发出命令
}
