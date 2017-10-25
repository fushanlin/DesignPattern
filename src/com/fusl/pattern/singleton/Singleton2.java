package com.fusl.pattern.singleton;

/**
 * 饿汉模式（线程安全）缺点加载慢
 * @author fusl
 *
 */
public class Singleton2 {

	private static Singleton2 instance;
	private Singleton2 (){}
	public static synchronized Singleton2 getInstance() {
		if(instance == null){
			instance = new Singleton2();
		}
		return instance;
	}
}
