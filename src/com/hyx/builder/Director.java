package com.hyx.builder;
/**
 * 创建者模式：
 * 把复杂类的构建与其表现相分离
 * 使的相同的构建有不同的表示
 * 涉及角色：
 * 具体产品
 * 抽象建造者
 * 具体建造者
 * 具体建造者
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
