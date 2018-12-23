package com.hyx.simplefactory;
/**
 * 专门定义一个类来负责创建其他类的实例。
 * 
 * 简单工厂模式属于类的创建型模式,又叫做静态
 *	工厂方法模式。通过专门定义一个类来负责创建
 *	其他类的实例，被创建的实例通常都具有共同的
 *	父类。
 * @author sewef
 *
 */
public class PhoneFactory {
	public static Phone create(String phone) {
		Phone p = null;
		try {
			Class<?> iphone = Class.forName(phone);
			p = (Phone) iphone.newInstance();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return p;
	}
}
