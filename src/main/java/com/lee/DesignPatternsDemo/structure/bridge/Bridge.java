package com.lee.DesignPatternsDemo.structure.bridge;

import com.lee.DesignPatternsDemo.structure.decorator.Sourceable;

public abstract class Bridge implements Sourceable{
	private Sourceable source;
	
	@Override
	public void method() {
		source.method();
	}

	public Sourceable getSource() {
		return source;
	}

	public void setSource(Sourceable source) {
		this.source = source;
	}

}
