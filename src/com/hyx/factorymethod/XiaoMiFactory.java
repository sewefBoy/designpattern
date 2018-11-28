package com.hyx.factorymethod;


public class XiaoMiFactory implements PhoneFactory {

	@Override
	public Phone create() {
		// TODO Auto-generated method stub
		return new XiaoMi();
	}

}
