package com.hyx.strategy;
/**
 * ����һϵ�е��㷨,������һ������װ����,����ʹ���ǿ��໥�滻����ģʽʹ���㷨�ɶ�����ʹ�����Ŀͻ����仯��
 *
 *  1.������ص����������Ϊ���졣�����ԡ��ṩ��һ���ö����Ϊ�е�һ����Ϊ������һ����ķ�����
    2.��Ҫʹ��һ���㷨�Ĳ�ͬ���塣
    3.�㷨ʹ�ÿͻ���Ӧ��֪�������ݡ���ʹ�ò���ģʽ�Ա��Ⱪ¶���ӵġ����㷨��ص����ݽṹ��
    4.һ���ඨ���˶�����Ϊ,������Щ��Ϊ�������Ĳ������Զ������������ʽ���֡�
      ����ص�������֧�������Ǹ��Ե�Strategy�����Դ�����Щ������䡣
 * 
 * 
 * ������
 *  1.Strategy ��������֧�ֵ��㷨�Ĺ����ӿڡ�Contextʹ������ӿ�������ĳConcreteStrategy������㷨��
    2.ConcreteStrategy ��Strategy�ӿ�ʵ��ĳ�����㷨��
    3.Context ��һ��ConcreteStrategy���������á� ά��һ����Strategy��������á� �ɶ���һ���ӿ�����Stategy�����������ݡ�
 * 
 * @author sewef
 *
 */
public class Context {
	private Strategy strategy;
	public Context(Strategy strategy) {
		this.strategy = strategy;
	}

	public void getFun(){
		strategy.getPhone();
	}
}