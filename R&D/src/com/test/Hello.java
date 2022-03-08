package com.test;

public class Hello {
	String title;
	int value;
	
	public Hello() {
	 title += " World";
	}
	public Hello(int value) {
		this.value = value;
		title = "Hello";
		//Hello();
	}
	
	public static void main(String[] args) {
		Hello c = new Hello(5);
		System.out.println(c.title);
	}
}

