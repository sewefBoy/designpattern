package com.test;

import com.hyx.proxy.statics.ProxyFactory;
/**
 *  Ϊ���������ṩһ�ִ����Կ��ƶ��������ķ��ʡ�
 * @author sewef
 *
 */
public class ProxyTest {
	public static void main(String[] args) {
		ProxyFactory phoneFactory = new ProxyFactory();
		phoneFactory.creatPhone();
	}
}
