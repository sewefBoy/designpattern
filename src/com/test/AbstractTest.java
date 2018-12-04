package com.test;

import com.hyx.abstractfactory.CommonPhoneFactory;
import com.hyx.abstractfactory.FullPhoneFactory;
import com.hyx.abstractfactory.Phone;
import com.hyx.abstractfactory.PhoneFactory;
/**
  * �����󹤳����ɶ����Ʒ��
 * �����Ʒ�ӿ�
 * �����Ʒ��  �����Ʒ��
 * �����Ʒ��  �����Ʒ��
 * ���󹤳�
 * ���幤��  ���幤�� 
 * @author sewef
 *
 */
public class AbstractTest {
	public static void main(String[] args) {
		PhoneFactory pFactory1 = new FullPhoneFactory();
		Phone xiaoMi1 = pFactory1.createXiaoMi();
		xiaoMi1.call();
		Phone huaWei1 = pFactory1.createHuaWei();
		huaWei1.call();
		
		PhoneFactory pFactory2 = new CommonPhoneFactory();
		Phone xiaoMi2 = pFactory2.createXiaoMi();
		xiaoMi2.call();
		Phone huaWei2 = pFactory2.createHuaWei();
		huaWei2.call();
	}
}
