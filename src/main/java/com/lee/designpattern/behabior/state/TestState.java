package com.lee.designpattern.behabior.state;

/**
 * @package: com.lee.designpattern.behabior.state
 * @ClassName: TestState
 * @Description:
 * @author: liting
 * @date: 2018-02-02 10:10
 */
public class TestState {
    public static void main(String[] args) {
        Context context = new Context();
        //空闲状态
        context.request(new FreeState());
        //预定状态
        context.request(new BookedState());
        //已入住
        context.request(new CheckedInState());
    }
}
