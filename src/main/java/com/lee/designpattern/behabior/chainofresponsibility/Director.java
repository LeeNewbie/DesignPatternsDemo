package com.lee.designpattern.behabior.chainofresponsibility;

/**
 * @package: com.lee.designpattern.behabior.chainofresponsibility
 * @ClassName: Director
 * @Description:
 * @author: liting
 * @date: 2018-02-02 11:20
 */
public class Director extends Leader {
    public Director(String name) {
        super(name);
    }

    /**
     * 责任链上对象对请求的具体处理
     */
    @Override
    public void handleRequest(LeaveRequest leader) {
        if (leader.getLeaveDays() <= 3) {
            System.out.println("请假人：" + leader.getEmpName() + ",天数：" + leader.getLeaveDays() + ",理由：" + leader.getReason());
            System.out.println("审批人：" + this.name + " 主任，审批通过！");
        } else {
            //如果有下一个继承者
            if (this.nextLeader != null) {
                //让下一个继承者处理请求
                this.nextLeader.handleRequest(leader);
            }
        }
    }
}
