package com.hyx.abstractfactory;

public class CommonPhoneFactory implements PhoneFactory{

	@Override
	public Phone createXiaoMi() {
		return new XiaoMiCommon();
	}

	@Override
	public Phone createHuaWei() {
		return new HuaWeiCommon();
	}

}
