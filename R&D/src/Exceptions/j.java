package Exceptions;

class A {
	void foo() throws ArrayIndexOutOfBoundsException {
		System.out.println("A");
		throw new ArrayIndexOutOfBoundsException();
	}
}

class SubB2 extends A {
	void foo() {
		System.out.println("B ");
	}
	
	void foo(String a) {
		System.out.println(a);
	}
}

class Tester {
	public static void main(String[] args) {
		A a = new SubB2();
		SubB2 sub = new SubB2();
		try {
			a.foo();
			sub.foo("D");
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
