package com.lee.designpattern.behabior.command;

/**
 * @package: com.lee.designpattern.behabior.command
 * @ClassName: TestCommand
 * @Description:
 * @author: liting
 * @date: 2018-01-30 10:13
 */
public class TestCommand {
    public static void main(String[] args) {
        Command command = new ConcreteCommand(new Receiver());
        command.execute();
    }
}
