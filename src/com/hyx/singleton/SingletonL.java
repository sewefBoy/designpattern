package com.hyx.singleton;
/**
 * ����ʽ
 * @author sewef
 *
 */
public class SingletonL {
	public static SingletonL singleton;
	private SingletonL() {}
	public static SingletonL getInstance() {
		if(singleton == null) {
			singleton = new SingletonL();
		}
		return singleton;
	}
}
