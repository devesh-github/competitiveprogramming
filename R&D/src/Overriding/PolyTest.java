package Overriding;

class Super {
	static String os = "";

	void doStuff() {
		os += "super ";
	}
}

public class PolyTest extends Super {
	public static void main(String[] args) {
		new PolyTest().go();
	}

	void go() {
		Super s = new PolyTest();
		PolyTest p = (PolyTest) s;
		p.doStuff();
		s.doStuff();
		p.doPoly();
		//s.doPoly();
		System.out.println(os);
	}

	void doStuff() {
		os += "over ";
	}

	void doPoly() {
		os += "poly ";
	}
}
