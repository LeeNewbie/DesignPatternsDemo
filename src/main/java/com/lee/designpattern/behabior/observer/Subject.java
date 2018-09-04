package com.lee.designpattern.behabior.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @package: com.lee.designpattern.behabior.observer
 * @ClassName: Subject
 * @Description:
 * @author: liting
 * @date: 2018-01-31 10:22
 */
public class Subject {
    //保存该主题下所有的观察者
    protected List<Observer> list = new ArrayList<Observer>();

    //添加观察者
    public void registerObserver(Observer observer) {
        list.add(observer);
    }

    //删除观察者
    public void removerObserver(Observer observer) {
        list.remove(observer);
    }

    //通知所有观察者
    public void notifyAllObserver() {
        for (Observer obs : list) {
            //更新当前主题（subject）对象的信息到所有观察者中
            obs.update(this);
        }
    }
}
