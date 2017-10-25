package com.fusl.pattern.decoration;

public class Duck extends Food {

	public Duck(){
		desc = "鸭肉";
	}
	@Override
	protected String getDesc() {
		// TODO Auto-generated method stub
		return desc;
	}

}
