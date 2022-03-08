package Overriding;

class Grandfather {
	static String name = "gf ";

	String doStuff() {
		return "grandf ";
	}
}

class Father extends Grandfather {
	static String name = "fa ";

	String doStuff() {
		return "father ";
	}
}

public class Child extends Father {
	static String name = "ch ";

	String doStuff() {
		return "child ";
	}

	public static void main(String[] args) {
		Father f = new Father();
		System.out.print(((Grandfather) f).name + ((Grandfather) f).doStuff());
		Child c = new Child();
		System.out.println(((Father) c).name + ((Grandfather) c).doStuff()
				+ ((Father) c).doStuff());
	}
}
