package Threads;

public class TestSeven extends Thread {
	private static int x;

	public synchronized void doThings() {
		int current = x;
		current++;
		x = current;
		System.out.println(x);
	}

	public void run() {
		doThings();
	}

	public static void main(String... x) {
		Thread t = new Thread(new TestSeven());
		//t.start();
		parse("invalid");
	}

	public static void parse(String str) {
		float f = 9;
		try {
			 f = Float.parseFloat(str);
		} catch (NumberFormatException nfe) {
			System.out.println(f);
			f = 0;
		} finally {
			System.out.println(f);
		}
	}

}
