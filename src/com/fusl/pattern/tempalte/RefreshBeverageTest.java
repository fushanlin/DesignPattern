package com.fusl.pattern.tempalte;

public class RefreshBeverageTest {
	
	public static void main(String[] args) {
		System.out.println("制备咖啡了。。。");
		RefreshBeverage b1 = new Coffee();
		b1.prepareBeverageTempalre();
		System.out.println("咖啡好了。。。");
		System.out.println("--------------------");
		System.out.println("制备茶。。。");
		RefreshBeverage b2 = new Tea();
		b2.prepareBeverageTempalre();
		System.out.println("茶制备好了");
	}
}
