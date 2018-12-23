package com.test;

import com.hyx.proxy.dynamic.HuaWeiPhone;
import com.hyx.proxy.dynamic.Phone;
import com.hyx.proxy.dynamic.PhoneHandler;
import com.hyx.proxy.dynamic.XiaoMiPhone;
import com.hyx.proxy.statics.ProxyFactory;
/**
 *  Ϊ���������ṩһ�ִ����Կ��ƶ��������ķ��ʡ�
 *  ��ɫ
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
		System.out.println("==�����Ƕ�̬==");
		PhoneHandler handler = new PhoneHandler();
		Phone phone = (Phone) handler.bind(new XiaoMiPhone());
		phone.creatPhone();
		
		Phone phone1 = (Phone) handler.bind(new HuaWeiPhone());
		phone1.creatPhone();
	}
}
