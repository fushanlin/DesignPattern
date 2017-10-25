package com.fusl.pattern.tempalte;

/*
 * 抽象基类为所有的子类提供算法框架
 * 
 * 使用final阻止子类复写
 * 
 * 提神饮料
 */
public abstract class RefreshBeverage {

	/**
	 * 封装了制备饮料的模板方法
	 * 封装所有的子类共同遵循的算法框架
	 */
	public final void prepareBeverageTempalre(){
		//步骤一 将水煮沸
		boilWater();
		//步骤二 泡制饮料
		brew();
		//倒入杯中
		pourIncup();
		if(isCustomerWantsCondiments()){
			//加入调味料
			addCondiments();
		}

	}
	/**
	 * 钩子函数（Hook）， 提供一个默认或空的实现具体子类
	 * 可以自行决定是否挂钩以及如何挂钩
	 * 询问用户是否加入调料
	 * @return
	 */
	protected boolean isCustomerWantsCondiments() {
		
		
		
		return true;
	}
	/**
	 * 加入调料
	 */
	protected abstract void addCondiments();
	/**
	 * 将饮料倒入杯中 直接输出
	 */
	private void pourIncup() {
		System.out.println("将饮料倒入杯中");
	}
	/**
	 * 抽象的基本方法，强制在子类中实现
	 */
	protected abstract void brew();
	/**
	 * 基本方法 将水煮沸
	 */
	private void boilWater() {	
		System.out.println("将水煮沸");
	};
}
