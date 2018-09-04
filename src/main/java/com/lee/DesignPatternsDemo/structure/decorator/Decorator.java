package com.lee.DesignPatternsDemo.structure.decorator;

public class Decorator implements Sourceable{
	
	private Source source;
	
	public Decorator(Source source) {
		this.source = source;
	}

	@Override
	public void method() {
		System.out.println("decorate before");
		source.method();
		System.out.println("decorate after");
		
	}
}
