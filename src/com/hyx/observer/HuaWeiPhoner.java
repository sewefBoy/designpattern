package com.hyx.observer;

import java.util.Observable;

public class HuaWeiPhoner implements PhonerObserver{

	@Override
	public void update(Observable o, Object arg) {
		System.out.println("�������仯"); 
	}

}
