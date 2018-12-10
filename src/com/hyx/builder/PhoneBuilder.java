package com.hyx.builder;
/**
 * 抽象创建接口
 * @author sewef
 *
 */
public interface PhoneBuilder {
	
	public void buildScreen();
	
	public void buildCamera();
	
	public void buildFingerLock();
}
