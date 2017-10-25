package com.fusl.pattern.tempalte;

/**
 * 具体子类提供了制备茶的具体实现
 * @author fusl
 *
 */
public class Tea extends RefreshBeverage {

	@Override
	protected void addCondiments() {
		System.out.println("加入柠檬");
	}

	@Override
	protected void brew() {
		System.out.println("用80度的热水浸泡10分钟");
	}
	//子类选择是否挂载钩子函数
	@Override
	protected boolean isCustomerWantsCondiments() {
		// TODO Auto-generated method stub
		return false;
	}

}
