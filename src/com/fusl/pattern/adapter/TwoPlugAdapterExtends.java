package com.fusl.pattern.adapter;

public class TwoPlugAdapterExtends extends GBTwoPlug implements ThreePlugIf {

	
	@Override
	public void powerWithThree() {
		// TODO Auto-generated method stub
		System.out.println("借助继承适配器");
		this.powerWithTwo();
	}

}
