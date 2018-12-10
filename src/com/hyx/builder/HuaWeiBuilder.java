package com.hyx.builder;
/**
 * 具体创建类
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
		phone.setScreen("华为 --> 屏幕");
	}

	@Override
	public void buildCamera() {
		phone.setCamera("华为 --> 摄像头");
	}

	@Override
	public void buildFingerLock() {
		phone.setFingerLock("华为 --> 指纹解锁");
	}
}
