package com.lee.designpattern.behabior.observer;

/**
 * @package: com.lee.designpattern.behabior.observer
 * @ClassName: ConcreteObserver
 * @Description:
 * @author: liting
 * @date: 2018-01-31 10:21
 */
public class ConcreteObserver implements Observer {
    /**
     * state对象需要和subject中的state保o`持一致
     */
    private int state;

    @Override
    public void update(Subject subject) {
        //当目标对象（主题对象）状态发生改变时，观察者也发生改变。
        this.state = ((ConcreteSubject) subject).getState();
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }
}
