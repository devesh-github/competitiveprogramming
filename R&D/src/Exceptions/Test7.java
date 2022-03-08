package Exceptions;

public class Test7 {
	public static void main(String args[]) throws Exception {
		Test7 t = new Test7();
		t.method();
		System.out.println("Print");
	}

	public void method() throws Exception {
		throw new Exception();
	}
}
