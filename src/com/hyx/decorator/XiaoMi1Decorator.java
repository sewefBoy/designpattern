package com.hyx.decorator;

public class XiaoMi1Decorator extends Decorator{

	public XiaoMi1Decorator(Phone phone) {
		super(phone);
	}
	
	public void photo() {
		System.out.println("Ð¡Ã×photo");
	}

	@Override
	public void function() {
		super.function();
		photo();
	}
}
