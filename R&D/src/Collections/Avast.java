package Collections;

public class Avast {
	static public void main(String[] scurvy) {
		System.out.println("Inside main() 1");
		//System.out.print(scurvy[1] + " ");
		main("abc");
	}

	public static void main(String dogs) {
		System.out.println("Inside main() 2");
		assert (dogs == null);
		System.out.println(dogs);
	}
	
	public static void main(String[]... dogs) {
		System.out.println("Inside main() 3");
		assert (dogs == null);
		System.out.println(dogs);
	}
}
