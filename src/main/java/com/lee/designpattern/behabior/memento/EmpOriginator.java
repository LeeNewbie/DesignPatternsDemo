package com.lee.designpattern.behabior.memento;

/**
 * @package: com.lee.designpattern.behabior.memento
 * @ClassName: EmpOriginator
 * @Description:
 * @author: liting
 * @date: 2018-02-01 10:19
 */
public class EmpOriginator {
    //需要备份的自身属性
    private String ename;
    private int age;
    private double salary;

    //备份
    public EmpMemento memento() {
        return new EmpMemento(this);//将当前自身对象备份
    }

    //恢复
    public void recovery(EmpMemento emp) {
        this.ename = emp.getEname();
        this.age = emp.getAge();
        this.salary = emp.getSalary();
    }
    //省略get，set和带参构造器


    public EmpOriginator(String ename, int age, double salary) {
        this.ename = ename;
        this.age = age;
        this.salary = salary;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
