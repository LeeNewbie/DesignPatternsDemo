package com.lee.designpattern.behabior.command;

/**
 * @package: com.lee.designpattern.behabior.command
 * @ClassName: Command
 * @Description:
 * @author: liting
 * @date: 2018-01-30 10:07
 */
public interface Command {
    /**
     * 1
     */
    void execute();
}

/**
 * 具体命令类
 */
class ConcreteCommand implements Command {
    /**
     * 持有真正执行命令对象的引用
     */
    private Receiver receiver;

    public ConcreteCommand(Receiver receiver) {
        super();
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        //调用接收者执行命令的方法
        receiver.action();
    }
}