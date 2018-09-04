package com.lee.designpattern.construction.singleton;

import java.lang.reflect.Constructor;

/**
 * @package: com.lee.designpattern.singleton
 * @ClassName: TestSingletonReflect
 * @Description: 破解单例
 * @author: liting
 * @date: 2018-01-26 11:44
 */
public class TestSingletonReflect {

    public static void main(String[] args) throws Exception {
        Singleton1 s1 = Singleton1.getInstance();
        Singleton1 s2 = Singleton1.getInstance();
        System.out.println(s1 == s2);//true

        //通过反射破解
        Class<Singleton1> clazz = (Class<Singleton1>) Class.forName(Singleton1.class.getName());
        //获得无参构造器
        Constructor<Singleton1> c = clazz.getDeclaredConstructor(null);
        //跳过检查：可以访问private构造器
        c.setAccessible(true);
        //此时会报错：没有权限访问私有构造器
        Singleton1 s3 = c.newInstance();
        Singleton1 s4 = c.newInstance();
        //不加c.setAccessible(true)则会报错。此时的结果就是false，获得的就是两个对象
        System.out.println(s3==s4);

//        private Singleton6(){
//            if (instance != null) {
//                //如果不是第一次构建，则直接抛出异常。不让创建
//                throw new RuntimeException();
//            }
//        }
    }
}
