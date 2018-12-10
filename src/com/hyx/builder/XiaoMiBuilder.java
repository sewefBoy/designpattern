package com.hyx.builder;
/**
 * 具体创建类
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
		phone.setScreen("小米 --> 屏幕");
	}

	@Override
	public void buildCamera() {
		phone.setCamera("小米 --> 摄像头");
	}

	@Override
	public void buildFingerLock() {
		phone.setFingerLock("小米 --> 指纹解锁");
	}
}
