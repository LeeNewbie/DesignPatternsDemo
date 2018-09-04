package com.lee.designpattern.behabior.chainofresponsibility;

/**
 * @package: com.lee.designpattern.behabior.chainofresponsibility
 * @ClassName: Manager
 * @Description:
 * @author: liting
 * @date: 2018-02-02 11:21
 */
public class Manager extends Leader {
    public Manager(String name) {
        super(name);
    }

    /**
     * 责任链上对象对请求的具体处理
     */
    @Override
    public void handleRequest(LeaveRequest leader) {
        if (leader.getLeaveDays() <= 10) {
            System.out.println("请假人：" + leader.getEmpName() + ",天数：" + leader.getLeaveDays() + ",理由：" + leader.getReason());
            System.out.println("审批人：" + this.name + " 经理，审批通过！");
        } else {
            if (this.nextLeader != null) {//如果有下一个继承者
                //让下一个继承者处理请求
                this.nextLeader.handleRequest(leader);
            }
        }
    }
}
