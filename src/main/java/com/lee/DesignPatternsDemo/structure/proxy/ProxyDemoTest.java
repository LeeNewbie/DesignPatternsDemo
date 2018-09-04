package com.lee.DesignPatternsDemo.structure.proxy;

import com.lee.DesignPatternsDemo.structure.decorator.Source;
import com.lee.DesignPatternsDemo.structure.decorator.Sourceable;

public class ProxyDemoTest {
	public static void main(String[] args) {
		ProxyHandler proxyHandler = new ProxyHandler();
		Sourceable source = (Sourceable) proxyHandler.bind(new Source());
		source.method();
	}
}
