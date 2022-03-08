package Overloading;

public class TestOverloading extends Parent {
	
	public void add() throws Exception {
		System.out.println("Inside Child class");
	}
	
	public static void main(String[] args) {
		/*int j = 10;
		j <<=2;
		j = (j-1)>>>3;
		System.out.println(j);*/
	}
}

class Parent {
	
	public void add() throws ArithmeticException {
		System.out.println("Inside Parent class");
	}
	
}
