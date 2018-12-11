package com.hyx.decorator;

public class XiaoMi2Decorator extends Decorator{

	public XiaoMi2Decorator(Phone phone) {
		super(phone);
	}
	
	public void fingerLock() {
		System.out.println("Ð¡Ã×fingerLock");
	}

	@Override
	public void function() {
		super.function();
		fingerLock();
	}
}
