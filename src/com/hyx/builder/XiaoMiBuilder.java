package com.hyx.builder;
/**
 * ���崴����
 * @author sewef
 *
 */
public class XiaoMiBuilder implements PhoneBuilder{
	private Phone phone;
	public XiaoMiBuilder(Phone phone) {
		this.phone = phone;
	}
	@Override
	public void buildScreen() {
		phone.setScreen("С�� --> ��Ļ");
	}

	@Override
	public void buildCamera() {
		phone.setCamera("С�� --> ����ͷ");
	}

	@Override
	public void buildFingerLock() {
		phone.setFingerLock("С�� --> ָ�ƽ���");
	}
}
