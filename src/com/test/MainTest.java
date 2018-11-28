package com.test;

import com.hyx.factorymethod.HuaWeiFactory;
import com.hyx.factorymethod.XiaoMiFactory;
import com.hyx.simplefactory.Phone;
import com.hyx.simplefactory.PhoneFactory;

public class MainTest {
	public static void main(String[] args) {
		//简单工厂
		Phone phone = PhoneFactory.create("com.hyx.simplefactory.XiaoMi");
		phone.call();
		
		Phone phone1 = PhoneFactory.create("com.hyx.simplefactory.HuaWei");
		phone1.call();
		
		//工厂方法
		com.hyx.factorymethod.PhoneFactory pf = new XiaoMiFactory();
		com.hyx.factorymethod.Phone p = pf.create();
		p.call();
		
		com.hyx.factorymethod.PhoneFactory hw = new HuaWeiFactory();
		com.hyx.factorymethod.Phone h = hw.create();
		h.call();
	}
}
