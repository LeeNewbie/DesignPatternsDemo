package com.lee.DesignPatternsDemo.creat.factory;

public class PersonFactoryDemo1 implements Provider{
	
	public Person produce(){
		return new Asia();
	}
	
}
