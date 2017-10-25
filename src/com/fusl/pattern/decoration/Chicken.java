package com.fusl.pattern.decoration;

public class Chicken extends Food {

	public Chicken (){
		desc = "鸡肉";
	}
	@Override
	protected String getDesc() {
		// TODO Auto-generated method stub
		return desc;
	}
	
	/**
	 * 适配器模式将一个类的接口，转换成客户期望的另一个接口。是得原来由于几口不兼容而不能一起工作的那些类可以在一起工作
	 * （解决不兼容不匹配）
	 */

}
