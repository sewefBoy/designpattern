package com.hyx.observer;

import java.util.Observable;

public class XiaoMiFactory extends Observable {

	public void create() {
		System.out.println("小米发布新手机");
		this.setChanged();
		this.notifyObservers();
	}

}
