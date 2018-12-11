package com.hyx.prototype;

import java.util.List;

/**
 * ԭ��ģʽ
 * ͨ������ԭ�ʹ����µĶ���
 * ʵ��Cloneable
 * ǳ�ȿ�¡
 * @author sewef
 *
 */
public class PhoneQ implements Cloneable{
	private String name;
	private List<String> type;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getType() {
		return type;
	}
	public void setType(List<String> type) {
		this.type = type;
	}
	public PhoneQ clone() {
		try {
			return (PhoneQ) super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
}
