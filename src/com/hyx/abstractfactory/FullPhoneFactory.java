package com.hyx.abstractfactory;

public class FullPhoneFactory implements PhoneFactory{

	@Override
	public Phone createXiaoMi() {
		return new XiaoMiFull();
	}

	@Override
	public Phone createHuaWei() {
		return new HuaWeiFull();
	}

}
