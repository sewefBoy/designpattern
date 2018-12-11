package com.hyx.decorator;

public class XiaoMi implements Phone{

	@Override
	public void call() {
		System.out.println("小米call");
	}

	@Override
	public void message() {
		System.out.println("小米message");
	}

	@Override
	public void function() {
		this.call();
		this.message();
	}

}
