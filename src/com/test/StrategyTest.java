package com.test;

import com.hyx.strategy.Context;
import com.hyx.strategy.HuaWeiStrategy;
import com.hyx.strategy.XiaoMiStrategy;

public class StrategyTest {
	public static void main(String[] args) {
		
		Context context = new Context(new XiaoMiStrategy());
		context.getFun();
		
		Context context1 = new Context(new HuaWeiStrategy());
		context1.getFun();
	}
}
