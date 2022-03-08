package com.test;

public class StringTest {

	public static void main(String[] args) {
		String a = "hello";
		String b = "hello";
		String c = new String("hello");

		System.out.println(a == b);
		System.out.println(a.equals(b));
		System.out.println(a == c);
		System.out.println(a.equals(c));
	}

}
