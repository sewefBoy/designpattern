package com.test;

import com.hyx.abstractfactory.CommonPhoneFactory;
import com.hyx.abstractfactory.FullPhoneFactory;
import com.hyx.abstractfactory.Phone;
import com.hyx.abstractfactory.PhoneFactory;
/**
  * （抽象工厂生成多个产品）
 * 抽象产品接口
 * 抽象产品类  抽象产品类
 * 具体产品类  具体产品类
 * 抽象工厂
 * 具体工厂  具体工厂 
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
