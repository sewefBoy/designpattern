package com.test;

import com.hyx.proxy.statics.ProxyFactory;
/**
 *  Ϊ���������ṩһ�ִ����Կ��ƶ��������ķ��ʡ�
 �����ɫ��ͨ���ӿڻ������������ʵ��ɫʵ�ֵ�ҵ�񷽷���
 ��ʵ��ɫ��ʵ�ֳ����ɫ��������ʵ��ɫ��Ҫʵ�ֵ�ҵ���߼����������ɫ���á�
 �����ɫ��ʵ�ֳ����ɫ������ʵ��ɫ�Ĵ���ͨ����ʵ��ɫ��ҵ���߼�������ʵ�ֳ��󷽷��������Ը����Լ��Ĳ�����
 * @author sewef
 *
 */
public class ProxyTest {
	public static void main(String[] args) {
		ProxyFactory phoneFactory = new ProxyFactory();
		phoneFactory.creatPhone();
	}
}
