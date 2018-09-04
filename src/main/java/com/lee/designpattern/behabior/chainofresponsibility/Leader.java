package com.lee.designpattern.behabior.chainofresponsibility;

/**
 * @package: com.lee.designpattern.behabior.chainofresponsibility
 * @ClassName: Leader
 * @Description:
 * @author: liting
 * @date: 2018-02-02 11:18
 */
public abstract class Leader {

    protected String name;
    protected Leader nextLeader;//下一个继承者

    public Leader(String name) {
        super();
        this.name = name;
    }

    //设置责任链上的下一个继承者
    public void setNextLeader(Leader nextLeader) {
        this.nextLeader = nextLeader;
    }

    //处理请求的抽象方法
    public abstract void handleRequest(LeaveRequest leader);
}
