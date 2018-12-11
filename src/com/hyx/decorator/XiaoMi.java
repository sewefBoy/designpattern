package com.hyx.decorator;

public class XiaoMi implements Phone{

	@Override
	public void call() {
		System.out.println("С��call");
	}

	@Override
	public void message() {
		System.out.println("С��message");
	}

	@Override
	public void function() {
		this.call();
		this.message();
	}

}
