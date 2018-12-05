package com.hyx.singleton;
/**
 * ����ʽ
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
