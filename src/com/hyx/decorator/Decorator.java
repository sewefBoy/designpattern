package com.hyx.decorator;
/**
 * 装饰者模式：
 * 动态的对象扩展职责，不用修改继承实现的类
 * 涉及角色：
 * 抽象接口产品（顶级）
 * 具体产品
 * 抽象装饰产品
 * 具体装饰产品
 * @author sewef
 *
 */
public abstract class Decorator implements Phone{
	private Phone phone;
	
	public Decorator(Phone phone) {
		this.phone = phone;
	}

	public void call() {
		phone.call();
	}
	
	public void message() {
		phone.message();
	}
	
	public void function() {
		phone.function();
	}
}
