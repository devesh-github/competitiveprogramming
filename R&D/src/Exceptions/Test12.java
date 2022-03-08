package Exceptions;

import java.io.IOException;

public class Test12 extends A {
	public void method() throws Exception {
		System.out.println("Subclass");
	}

	public static void main(String args[]) throws Exception {
		A a = new A();
		a.method();
		a = new Test12();
		a.method();
	}
}

class A {
	public void method() throws IOException {
		System.out.println("Superclass");
	}
}
