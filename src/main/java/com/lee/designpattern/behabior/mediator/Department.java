package com.lee.designpattern.behabior.mediator;

/**
 * @package: com.lee.designpattern.behabior.mediator
 * @ClassName: Department
 * @Description:
 * @author: liting
 * @date: 2018-02-01 9:59
 */
public interface Department {
    void selfAction();//做本部门的事

    void outAction();//向总经理发出申请
}
