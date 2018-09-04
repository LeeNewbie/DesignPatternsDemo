package com.lee.designpattern.behabior.iterator;

/**
 * @package: com.lee.designpattern.behabior.iterator
 * @ClassName: MyIterator
 * @Description:
 * @author: liting
 * @date: 2018-01-31 10:04
 */
public interface MyIterator {

    void first();//将游标指向第一个元素

    void next();//将游标指向下一个元素

    boolean hasNext();//判断是否有下一个元素

    boolean isFirst();//判断是否是第一个元素

    boolean isLast();//判断是否是最后一个元素

    Object getCurrentObj();//获取当前对象
}
