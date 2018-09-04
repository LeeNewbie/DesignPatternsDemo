package com.lee.designpattern.behabior.memento;

import java.util.Stack;

/**
 * @package: com.lee.designpattern.behabior.memento
 * @ClassName: CareTaker
 * @Description:
 * @author: liting
 * @date: 2018-02-01 10:21
 */
public class CareTaker {
    //需要管理的备忘录对象，这里也可以使用一个list容器来存储。这样可以备份多个点
    //或者使用一个Stack栈来保存，因为Stack是后进先出的
    private Stack<EmpMemento> stack = new Stack<EmpMemento>();

    //备份emp数据到栈中
    public void setEmpMemento(EmpMemento emp) {
        stack.push(emp);
    }

    //从栈中获取最近一次备份的emp数据
    public EmpMemento getEmpForStack() {
        if (!stack.empty()) {
            return stack.peek();//peek只获取，不删除
        } else {
            return null;
        }
    }

    //从栈中获取最近一次备份的emp数据,并且从栈中删除该数据
    public EmpMemento getEmpForStackAndRemove() {
        if (!stack.empty()) {
            return stack.pop();//pop获取后删除该元素
        } else {
            return null;
        }
    }

}
