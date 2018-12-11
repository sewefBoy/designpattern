package com.test;

import com.hyx.decorator.Decorator;
import com.hyx.decorator.XiaoMi;
import com.hyx.decorator.XiaoMi1Decorator;
import com.hyx.decorator.XiaoMi2Decorator;
import com.hyx.decorator.XiaoMi3Decorator;

public class DecoratorTest {
	public static void main(String[] args) {
		XiaoMi phone = new XiaoMi();
		Decorator xiaomi = new XiaoMi1Decorator(phone);
		Decorator xiaomi2 = new XiaoMi2Decorator(xiaomi);
		Decorator xiaomi3 = new XiaoMi3Decorator(xiaomi2);
		xiaomi.function();
		System.out.println("=============");
		xiaomi2.function();
		System.out.println("=============");
		xiaomi3.function();
	}
}
