package com.test;

import com.hyx.observer.HuaWeiFactory;
import com.hyx.observer.HuaWeiPhoner;
import com.hyx.observer.XiaoMiFactory;
import com.hyx.observer.XiaoMiPhoner;

public class ObserverTest {
	public static void main(String[] args) {
		HuaWeiFactory huaWeiFactory = new HuaWeiFactory();
		huaWeiFactory.addObserver(new HuaWeiPhoner());
		huaWeiFactory.create();
		
		XiaoMiFactory xiaoMiFactory = new XiaoMiFactory();
		xiaoMiFactory.addObserver(new XiaoMiPhoner());
		xiaoMiFactory.create();
	}
}
