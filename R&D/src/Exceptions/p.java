package Exceptions;

public class p {
	static void test() {
		try {
			String x = null;
			System.out.print(x.toString() + " ");
		} finally {
			System.out.print("finally ");
			throw new RuntimeException();
		}
	}

	public static void main(String[] args) {
		try {
			test();
		} catch (Exception ex) {
			System.out.print("exception ");
		}
	}
}
