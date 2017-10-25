package com.fusl.pattern.adapter;

public class TwoPlugAdapter implements ThreePlugIf {
	
	private GBTwoPlug plug;
	
	public TwoPlugAdapter(GBTwoPlug gbTwoPlug) {
		// TODO Auto-generated constructor stub
		this.plug = gbTwoPlug;
	}

	@Override
	public void powerWithThree() {
		// TODO Auto-generated method stub
		System.out.println("通过转化");
		plug.powerWithTwo();
	}

}
