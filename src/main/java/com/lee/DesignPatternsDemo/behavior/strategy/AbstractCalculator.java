package com.lee.DesignPatternsDemo.behavior.strategy;

/**
 * @ClassName：AbstractCalculator
 * @Description：辅助类
 * @company:zhph
 * @author liting
 * @date 2017年11月29日 上午10:27:34
 */
 
public abstract class AbstractCalculator implements ICalculator{
	
	public int[] split(String exp, String opt) {
		String array[] = exp.split(opt);
		int arrayInt[] = new int[2];
		arrayInt[0] = Integer.parseInt(array[0]);
		arrayInt[1] = Integer.parseInt(array[1]);
		return arrayInt;
	}
	
	abstract public int caculate(String exp);
	
}
