package com.lee.DesignPatternsDemo.structure.proxy;

import com.lee.DesignPatternsDemo.structure.decorator.Source;
import com.lee.DesignPatternsDemo.structure.decorator.Sourceable;

public class Proxy implements Sourceable{
	
	private Source source ;
	public Proxy() {
		source = new Source();
	}

	@Override
	public void method() {
		System.out.println("before");
		source.method();
		System.out.println("after");
	}

	
}
