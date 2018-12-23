package com.hyx.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class PhoneHandler implements InvocationHandler{
	private Phone phone;
	public void dazhe() {
		System.out.println("����");
	}
	
	public void daijunjuan() {
		System.out.println("����ȯ");
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		Object result = null;//�����������ΪObject����
        //����Ϳ��Խ�����ν��AOP�����
        //�ڵ��þ��庯������ǰ��ִ�й��ܴ���
		dazhe();
		daijunjuan();
        result = method.invoke(phone,args);
        //�ڵ��þ��庯��������ִ�й��ܴ���
        return result;
	}
	
	public Object bind(Phone phone) {
		this.phone = phone;
		return Proxy.newProxyInstance(phone.getClass().getClassLoader(),
				phone.getClass().getInterfaces(), this);
	}
}
