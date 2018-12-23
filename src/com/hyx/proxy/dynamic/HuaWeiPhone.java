package com.hyx.proxy.dynamic;
/**
 * 动态代理
 * @author sewef
 *
 */
public class HuaWeiPhone implements Phone{

	@Override
	public void creatPhone() {
		System.out.println("华为手机");
	}

}
