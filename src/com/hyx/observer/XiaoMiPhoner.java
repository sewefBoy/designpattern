package com.hyx.observer;

import java.util.Observable;

public class XiaoMiPhoner implements PhonerObserver{

	@Override
	public void update(Observable o, Object arg) {
		System.out.println("对象发生变化"); 
	}

}
