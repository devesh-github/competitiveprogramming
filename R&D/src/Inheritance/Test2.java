package Inheritance;

class Sup {
	public Sup(String str) {
		System.out.println("Super class");
	}
}

public class Test2 extends Sup {
	public Test2() {
		super("9");
		System.out.println("Sub class");
	}

	/*public static void main(String[] args) {
		Test2 t2 = new Test2();
	}*/
	public static void main(String args) {
		Test2 t2 = new Test2();
	}
}
