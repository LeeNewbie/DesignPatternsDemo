package com.lee.designpattern.behabior.observer;

/**
 * @package: com.lee.designpattern.behabior.observer
 * @ClassName: Observer
 * @Description:
 * @author: liting
 * @date: 2018-01-31 10:21
 */
public interface Observer {
    /**
     * 传入主题对象,得到主题对象的通知时更新自己
     */
    void update(Subject subject);
}
