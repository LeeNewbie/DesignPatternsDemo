package com.lee.designpattern.behabior.state;

import java.util.UUID;

/**
 * @package: com.lee.designpattern.behabior.state
 * @ClassName: Context
 * @Description:
 * @author: liting
 * @date: 2018-02-02 10:08
 */
public class Context {
    /**
     * 当前状态
     */
    private State state;

    /**
     *
     * @param s
     */
    public void request(State s) {
        System.out.print("修改状态：");
        this.state = s;
        state.handler();
        System.out.println(UUID.randomUUID().toString());
    }
}
