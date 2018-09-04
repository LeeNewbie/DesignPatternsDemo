package com.lee.DesignPatternsDemo.behavior.strategy;

/**
 * @ClassName：Plus
 * @Description：策略模式
 * @company:zhph
 * @author liting
 * @date 2017年11月29日 上午10:39:48
 */
 
public class Plus extends AbstractCalculator {

	@Override
	public int caculate(String exp) {
		int arrayInt[] = split(exp, "\\+");
		return arrayInt[0] + arrayInt[1];
	}

	public static void main(String[] args) {
		ICalculator plus = new Plus();
		int x = plus.caculate("8+2");
		System.out.println(x);
	}
}
