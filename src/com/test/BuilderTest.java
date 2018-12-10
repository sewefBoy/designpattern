package com.test;

import com.hyx.builder.Director;
import com.hyx.builder.Phone;

public class BuilderTest {
	public static void main(String[] args) {
		Director director = new Director();
		Phone xm = director.buildXiaoMi();
		xm.toString();
		
		Phone hw = director.buildHuaWei();
		hw.toString();
	}
}
