package com.fusl.pattern.singleton;

/**
 * 单例模式之（枚举）
 * @author fusl
 *
 *能够避免线程同步问题，而且还能防止反序列化重新创建对象，
 */
public enum Singleton6 {
	INSTACE;
	public void whateverMethod(){
	}
}
