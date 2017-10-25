package com.fusl.pattern.decoration;

/**
 * 蒸 ：装饰者
 * @author fusl
 *
 */
public class SteamedFood extends FoodDecoration{

	private Food food;
	public SteamedFood(Food f){
		this.food = f;
	}
	private String getDecoration(){
		return "蒸";
	}
	@Override
	public String getDesc() {
		return getDecoration()+food.getDesc();
	}
}
