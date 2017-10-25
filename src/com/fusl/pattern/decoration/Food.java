package com.fusl.pattern.decoration;

/**
 * 装饰者模式
 * 动态的将责任附加到对象上。若要扩展功能，装饰者提供了比继承更加有弹性的替代方案
 * 组合和继承的区别：
 * 继承： 
 * 
 * 组合：
 * 
 * @author fusl
 *
 * 食物基类
 */
public abstract class Food {
	protected String desc;
	protected abstract String getDesc();
}
