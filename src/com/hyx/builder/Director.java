package com.hyx.builder;
/**
 * ÷∏ª”’ﬂ
 * @author sewef
 *
 */
public class Director {
	public Phone buildXiaoMi() {
		Phone phone = new Phone();
		PhoneBuilder builder = new XiaoMiBuilder(phone);
		builder.buildCamera();
		builder.buildScreen();
		builder.buildFingerLock();
		System.out.println(phone.toString());
		return phone;
	}
	
	public Phone buildHuaWei() {
		Phone phone = new Phone();
		PhoneBuilder builder = new HuaWeiBuilder(phone);
		builder.buildCamera();
		builder.buildScreen();
		builder.buildFingerLock();
		System.out.println(phone.toString());
		return phone;
	}
}
