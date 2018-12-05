package com.test.prototype;

import java.util.ArrayList;
import java.util.List;

import com.hyx.prototype.PhoneQ;
import com.hyx.prototype.PhoneS;

public class ProtoTypeTest {
	public static void main(String[] args) {
		PhoneQ phoneQ = new PhoneQ();
		phoneQ.setName("xiaomi");
		List<String> types = new ArrayList<>();
		types.add("xiaomi");
		types.add("huawei");
		phoneQ.setType(types);
		
		types.add("oppo");
		PhoneQ phoneKL = phoneQ.clone();
		System.out.println(phoneQ == phoneKL);
		System.out.println(phoneQ.getType() == phoneKL.getType());
		
		/*PhoneS phoneQ = new PhoneS();
		phoneQ.setName("xiaomi");
		List<String> types = new ArrayList<>();
		types.add("xiaomi");
		types.add("huawei");
		phoneQ.setTypes(types);
		
		types.add("oppo");
		PhoneS phoneKL = phoneQ.clone();
		System.out.println(phoneQ == phoneKL);
		System.out.println(phoneQ.getTypes() == phoneKL.getTypes());*/
	}
}
