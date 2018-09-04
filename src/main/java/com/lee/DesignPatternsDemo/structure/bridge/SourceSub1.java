package com.lee.DesignPatternsDemo.structure.bridge;

import com.lee.DesignPatternsDemo.structure.decorator.Sourceable;

public class SourceSub1 implements Sourceable{

	@Override
	public void method() {
		System.out.println("1");
		
	}

}
