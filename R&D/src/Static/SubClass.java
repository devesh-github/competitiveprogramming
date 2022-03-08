package Static;

class SuperClass {
	private void printMe() {
		System.out.print("super context ");
	}
}

public class SubClass extends SuperClass {
	private  void printMe() throws ArithmeticException {
		System.out.print("sub context ");
	}
	
	public static int printMe(int rs) throws ArithmeticException {
		System.out.print("sub context 2");
		
		return 1;
	}

	public static void main(String argv[]) {
		SuperClass sc = new SubClass();
		//sc.printMe();
		
		System.out.printf("12%1$s","13%1$s","14%1$s");
		
		System.out.printf("12%1$","13","14");
		
		SubClass sc2 = new SubClass();
		//sc2.printMe();
	}
}
