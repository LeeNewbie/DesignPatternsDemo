package com.lee.DesignPatternsDemo.structure.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import com.lee.DesignPatternsDemo.structure.decorator.Source;

public class ProxyHandler implements InvocationHandler{
	
	private Object source;
	
	public Object bind(Source source){
		this.source = source;
		return Proxy.newProxyInstance(source.getClass().getClassLoader(), source.getClass().getInterfaces(), this);
	}
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		Object result = null;
		System.out.println("before");
		result = method.invoke(source, args);
		System.out.println("after");
		return result;
	}

}
