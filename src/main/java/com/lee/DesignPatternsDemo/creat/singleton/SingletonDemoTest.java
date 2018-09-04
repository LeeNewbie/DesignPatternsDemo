package com.lee.DesignPatternsDemo.creat.singleton;

public class SingletonDemoTest {
	public static void main(String[] args) {
		Singleton singleton = Singleton.getInstance();
		singleton.read("haha");
	}
}
