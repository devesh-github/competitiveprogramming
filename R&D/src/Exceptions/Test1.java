package Exceptions;

public class Test1 {
	public static void main(String args[]) {
		System.out.println(method());
	}

	public static int method() {
		try {
			throw new Exception();
			//return 1;
		} catch (Exception e) {
			//return 2;
			throw new Exception();
		} finally {
			return 3;
			//throw new Exception();
		}
	}
}
