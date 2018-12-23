package com.hyx.simplefactory;
/**
 * ר�Ŷ���һ���������𴴽��������ʵ����
 * 
 * �򵥹���ģʽ������Ĵ�����ģʽ,�ֽ�����̬
 *	��������ģʽ��ͨ��ר�Ŷ���һ���������𴴽�
 *	�������ʵ������������ʵ��ͨ�������й�ͬ��
 *	���ࡣ
 * @author sewef
 *
 */
public class PhoneFactory {
	public static Phone create(String phone) {
		Phone p = null;
		try {
			Class<?> iphone = Class.forName(phone);
			p = (Phone) iphone.newInstance();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return p;
	}
}
