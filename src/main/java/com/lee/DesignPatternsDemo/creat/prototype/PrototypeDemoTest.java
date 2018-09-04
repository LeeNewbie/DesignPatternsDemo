package com.lee.DesignPatternsDemo.creat.prototype;

import java.io.IOException;

public class PrototypeDemoTest {
	public static void main(String[] args) throws ClassNotFoundException, IOException, CloneNotSupportedException {
		Prototype p1 = new Prototype("hehe");
		Prototype p3 = (Prototype) p1.clone();
		Prototype p2 = (Prototype) p1.deepClone();
		System.out.println(p3.getHaha() == p1.getHaha());
		System.out.println(p2.getHaha() == p1.getHaha());
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
	}
}
