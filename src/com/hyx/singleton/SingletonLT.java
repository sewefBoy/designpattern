package com.hyx.singleton;
/**
 * ����ʽ
 * ˫������ʽ
 * ���ģʽ��ͬ�������·ŵ�if�ڲ��������ִ�е�Ч�ʣ�����ÿ�λ�ȡ����ʱ������ͬ����
 * ֻ�е�һ�β�ͬ�����������Ժ��û��Ҫ�ˡ���������ģʽ�´������������ܴ��ڵ��̲߳���ȫ���⡣
 * @author sewef
 *
 */
public class SingletonLT {
	public static SingletonLT singleton;
	private SingletonLT() {}
	public static SingletonLT getInstance() {
		if(singleton == null) {
			synchronized (SingletonLT.class) {
				if(singleton == null) {
					singleton = new SingletonLT();
				}
			}
		}
		return singleton;
	}
}
