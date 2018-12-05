package com.test;

import com.hyx.singleton.SingletonL;

public class SingletonTest {
	public static void main(String[] args) {
		SingletonL s1 = SingletonL.getInstance();
		SingletonL s2 = SingletonL.getInstance();
		System.out.println(s1 == s2);
		System.out.println(s1.hashCode() == s2.hashCode());
		System.out.println(s1.equals(s2));
	}
}
