package com.lee.designpattern.behabior.command;

/**
 * @package: com.lee.designpattern.behabior.command
 * @ClassName: Invoker
 * @Description:
 * @author: liting
 * @date: 2018-01-30 10:12
 */
public class Invoker {
    private Command command;//持有命令对象的引用

    public Invoker(Command command) {
        super();
        this.command = command;
    }

    public void call() {
        //请求者调用命令对象执行命令的那个execute方法
        command.execute();
    }

}
