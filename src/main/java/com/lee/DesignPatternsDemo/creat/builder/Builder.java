package com.lee.DesignPatternsDemo.creat.builder;

import java.util.ArrayList;
import java.util.List;

public class Builder {
	private List<String> persons = new ArrayList<String>();
	
	public void addName(String name) {
		persons.add(name);
	}
	
	public void addAge(String age){
		persons.add(age);
	}
}
