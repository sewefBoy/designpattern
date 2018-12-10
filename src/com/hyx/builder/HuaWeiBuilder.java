package com.hyx.builder;
/**
 * ���崴����
 * @author sewef
 *
 */
public class HuaWeiBuilder implements PhoneBuilder{
	private Phone phone;
	public HuaWeiBuilder(Phone phone){
		this.phone = phone;
	}
	@Override
	public void buildScreen() {
		phone.setScreen("��Ϊ --> ��Ļ");
	}

	@Override
	public void buildCamera() {
		phone.setCamera("��Ϊ --> ����ͷ");
	}

	@Override
	public void buildFingerLock() {
		phone.setFingerLock("��Ϊ --> ָ�ƽ���");
	}
}
