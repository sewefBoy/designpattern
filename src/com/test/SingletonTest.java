package com.test;

import com.hyx.singleton.Singleton;

public class SingletonTest {
	public static void main(String[] args) {
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		System.out.println(s1 == s2);
		System.out.println(s1.hashCode() == s2.hashCode());
		System.out.println(s1.equals(s2));
	}
}
