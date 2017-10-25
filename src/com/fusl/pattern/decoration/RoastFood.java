package com.fusl.pattern.decoration;

/**
 * 烤食物
 * @author fusl
 *
 */
public class RoastFood extends FoodDecoration {

	private Food food;
	public RoastFood(Food f){
		this.food = f;
	}
	private String getDecoration(){
		return "烤";
	}
	@Override
	public String getDesc() {
		return getDecoration() + food.getDesc();
	}
}
