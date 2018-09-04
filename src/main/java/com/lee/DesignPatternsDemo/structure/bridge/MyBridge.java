package com.lee.DesignPatternsDemo.structure.bridge;

public class MyBridge extends Bridge{

	@Override
	public void method() {
		getSource().method();
	}
	
	
	public static void main(String[] args) {
		MyBridge myBridge = new MyBridge();
		myBridge.setSource(new SourceSub1());
		myBridge.method();
		myBridge.setSource(new SourceSub2());
		myBridge.method();
	}
}
