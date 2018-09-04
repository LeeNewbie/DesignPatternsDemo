package com.lee.designpattern.behabior.observer;

/**
 * @package: com.lee.designpattern.behabior.observer
 * @ClassName: ConcreteSubject
 * @Description:
 * @author: liting
 * @date: 2018-01-31 10:23
 */
public class ConcreteSubject extends Subject {
    /**
     * 默认状态为0
     */
    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        //当修改了主题对象状态时，通知所有观察者
        //通知所有观察者
        this.notifyAllObserver();
    }
}
