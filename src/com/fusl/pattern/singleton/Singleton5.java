package com.fusl.pattern.singleton;
/**
 * 单例模式之静态内部类的方法
 * 
 * 这种方式同样利用了classloder的机制来保证初始化instance时只有一个线程，他跟第三种和第四种方式的不同是（很细微的差别）
 * 第三种和第四种方式是只要singleton被加载那么instance就会被实例化，（没有达到lazy loading 的效果）
 * 而这种方式是singleton类被加载了，instance不一定被初始化。因为Singleton5没有被主动使用，只是显示通过getInstance
 * 方法时，才会显示装载Singleton5。。。。。。。。。。。。。。。。。。。。。。
 * 
 * @author fusl
 *
 */
public class Singleton5 {
	private static class SingletonHolder{
		private static final Singleton5 INSTANCE = new Singleton5();
	}
	private Singleton5 (){}
	public static final Singleton5 getInstance() {
		return SingletonHolder.INSTANCE;
	}
}
