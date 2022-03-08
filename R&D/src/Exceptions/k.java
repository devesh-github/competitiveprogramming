package Exceptions;

public class k {
	static void test() throws RuntimeException {
		try {
			System.out.print("test ");
			throw new RuntimeException();
		} catch (Exception ex) {
			System.out.print("exception ");
		}
	}

	public static void main(String[] args) {
		try {
			test();
		} catch (RuntimeException ex) {
			System.out.print("runtime ");
		}
		System.out.print("end ");
	}
}
