package com.lee.DesignPatternsDemo.creat.factory;

public class TestFactoryDemo1 {
	public static void main(String[] args) {
		Provider provider = new PersonFactoryDemo1();
		Person person1 = provider.produce();
		if (person1 != null) {
			person1.eat();
		}
	}
}
