package com.hyx.singleton;
/**
 * 饿汉式
 * 双重锁形式
 * 这个模式将同步内容下放到if内部，提高了执行的效率，不必每次获取对象时都进行同步，
 * 只有第一次才同步，创建了以后就没必要了。避免土豪模式下创建单例，可能存在的线程不安全问题。
 * @author sewef
 *
 */
public class SingletonLT {
	public static SingletonLT singleton;
	private SingletonLT() {}
	public static SingletonLT getInstance() {
		if(singleton == null) {
			synchronized (SingletonLT.class) {
				if(singleton == null) {
					singleton = new SingletonLT();
				}
			}
		}
		return singleton;
	}
}
