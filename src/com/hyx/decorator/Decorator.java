package com.hyx.decorator;
/**
 * װ����ģʽ��
 * ��̬�Ķ�����չְ�𣬲����޸ļ̳�ʵ�ֵ���
 * �漰��ɫ��
 * ����ӿڲ�Ʒ��������
 * �����Ʒ
 * ����װ�β�Ʒ
 * ����װ�β�Ʒ
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
