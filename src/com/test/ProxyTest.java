package com.test;

import com.hyx.proxy.dynamic.HuaWeiPhone;
import com.hyx.proxy.dynamic.Phone;
import com.hyx.proxy.dynamic.PhoneHandler;
import com.hyx.proxy.dynamic.XiaoMiPhone;
import com.hyx.proxy.statics.ProxyFactory;
/**
 *  为其他对象提供一种代理以控制对这个对象的访问。
 *  角色
 抽象角色：通过接口或抽象类声明真实角色实现的业务方法。
 真实角色：实现抽象角色，定义真实角色所要实现的业务逻辑，供代理角色调用。
 代理角色：实现抽象角色，是真实角色的代理，通过真实角色的业务逻辑方法来实现抽象方法，并可以附加自己的操作。
 * @author sewef
 *
 */
public class ProxyTest {
	public static void main(String[] args) {
		ProxyFactory phoneFactory = new ProxyFactory();
		phoneFactory.creatPhone();
		System.out.println("==下面是动态==");
		PhoneHandler handler = new PhoneHandler();
		Phone phone = (Phone) handler.bind(new XiaoMiPhone());
		phone.creatPhone();
		
		Phone phone1 = (Phone) handler.bind(new HuaWeiPhone());
		phone1.creatPhone();
	}
}
