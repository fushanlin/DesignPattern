package com.fusl.pattern.singleton;

/**
 * （饿汉模式： 变种）
 * @author fusl
 *
 */
public class Singleton4 {
	private static  Singleton4 instance = null;
	static{
		instance = new Singleton4();
	}
	private Singleton4(){}
	public static Singleton4 getInstance() {
		return instance;
	}
}
