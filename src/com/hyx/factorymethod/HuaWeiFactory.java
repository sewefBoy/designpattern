package com.hyx.factorymethod;

public class HuaWeiFactory implements PhoneFactory{

	@Override
	public Phone create() {
		// TODO Auto-generated method stub
		return new HuaWei();
	}

}
