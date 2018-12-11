package com.hyx.decorator;

public class XiaoMi3Decorator extends Decorator{

	public XiaoMi3Decorator(Phone phone) {
		super(phone);
	}
	
	public void fullScreen() {
		System.out.println("С��fullScreen");
	}

	@Override
	public void function() {
		super.function();
		fullScreen();
	}
}
