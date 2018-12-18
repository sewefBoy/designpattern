package com.hyx.proxy.statics;

public class ProxyFactory implements Phone{
	private XiaoMiPhone phone;
	@Override
	public void creatPhone() {
		if(phone == null) {
			phone = new XiaoMiPhone();
			daijunjuan();
			phone.creatPhone();
			dazhe();
		}
	}
	
	public void dazhe() {
		System.out.println("Дђел");
	}
	
	public void daijunjuan() {
		System.out.println("ДњН№ШЏ");
	}
}
