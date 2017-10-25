package com.fusl.pattern.tempalte;

/**
 * 具体子类，提供了咖啡制备的具体实现
 * @author fusl
 *
 */
public class Coffee extends RefreshBeverage {

	@Override
	protected void addCondiments() {
		System.out.println("添加糖和牛奶");
	}

	@Override
	protected void brew() {
		System.out.println("用沸水冲泡咖啡");
	}

}
