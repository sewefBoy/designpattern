package com.hyx.observer;

import java.util.Observable;

public class XiaoMiFactory extends Observable {

	public void create() {
		System.out.println("С�׷������ֻ�");
		this.setChanged();
		this.notifyObservers();
	}

}
