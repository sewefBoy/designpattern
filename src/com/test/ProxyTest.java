package com.test;

import com.hyx.proxy.statics.ProxyFactory;
/**
 *  为其他对象提供一种代理以控制对这个对象的访问。
 * @author sewef
 *
 */
public class ProxyTest {
	public static void main(String[] args) {
		ProxyFactory phoneFactory = new ProxyFactory();
		phoneFactory.creatPhone();
	}
}
