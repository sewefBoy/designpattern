package com.hyx.singleton;
/**
 * ¶öººÊ½
 * @author sewef
 *
 */
public class SingletonE {
	public static final SingletonE singleton = new SingletonE();
	private SingletonE() {}
	public static SingletonE getInstance() {
		return singleton;
	}
}
