package Inheritance;

interface TestA {
	String toString();
}
class Testing implements TestA{
	public String toString(){
		return "D";
	}
}

public class Test {
	public static void main(String[] args) {
		System.out.println( new Testing().toString());
		System.out.println(new TestA() {
			public String toString() {
				return "test";
			}
		});
	}
}
