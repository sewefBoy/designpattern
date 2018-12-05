package com.hyx.prototype;

import java.util.ArrayList;
import java.util.List;

public class PhoneS implements Cloneable{
	private String name;
	private List<String> types;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getTypes() {
		return types;
	}
	public void setTypes(List<String> types) {
		this.types = types;
	}
	
	public PhoneS clone() {
		PhoneS phone;
		try {
			phone = (PhoneS) super.clone();
			List<String> list = new ArrayList<>();
			for(String type:types) {
				list.add(type);
			}
			phone.setTypes(list);
			return phone;
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
}
