package com.hyx.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class PhoneHandler implements InvocationHandler{
	private Phone phone;
	public void dazhe() {
		System.out.println("打折");
	}
	
	public void daijunjuan() {
		System.out.println("代金券");
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		Object result = null;//被代理的类型为Object基类
        //这里就可以进行所谓的AOP编程了
        //在调用具体函数方法前，执行功能处理
		dazhe();
		daijunjuan();
        result = method.invoke(phone,args);
        //在调用具体函数方法后，执行功能处理
        return result;
	}
	
	public Object bind(Phone phone) {
		this.phone = phone;
		return Proxy.newProxyInstance(phone.getClass().getClassLoader(),
				phone.getClass().getInterfaces(), this);
	}
}
