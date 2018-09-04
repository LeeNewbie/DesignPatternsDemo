package com.lee.designpattern.construction.prototype;

import java.util.Date;

/**
 * @package: com.lee.designpattern.prototype
 * @ClassName: Sheep
 * @Description: 浅克隆-深克隆
 * @author: liting
 * @date: 2018-01-29 10:28
 */
public class Sheep implements Cloneable {

    private String sname;
    private Date birthday;

    public Sheep(String sname, Date birthday) {
        this.sname = sname;
        this.birthday = birthday;
    }

    /**
     * 重写Object对象的clone方法
     */
    @Override
    protected Object clone() throws CloneNotSupportedException {
        //直接调用Object对象的clone方法
        Object obj = super.clone();
        //深克隆：把对象下的所有属性也克隆出来
        Sheep s = (Sheep) obj;
        s.birthday = (Date) this.birthday.clone();
        return obj;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public static void main(String[] args) throws Exception {
        Date date = new Date(1274397294739L);
        Sheep s1 = new Sheep("原型羊", date);
        Sheep s2 = (Sheep) s1.clone();//克隆一个羊
        System.out.println(s1);
        System.out.println(s1.getSname());
        System.out.println("原日期：" + s1.getBirthday());
        date.setTime(34732834827389L);//改变原有date的值
        System.out.println("改变后的日期：" + date.toString());

        //克隆羊的信息
        System.out.println("---------------------------------");
        System.out.println(s2);
        System.out.println(s2.getSname());
        System.out.println(s2.getBirthday());//此时的birthday日期使用的是改变后的日期对象引用
    }

}


