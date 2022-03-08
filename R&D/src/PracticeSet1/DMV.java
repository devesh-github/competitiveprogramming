package PracticeSet1;

public class DMV implements Runnable {
	public static void main(String[] args) {
		DMV d = new DMV();
		//long b = System.currentTimeMillis();
		//System.out.println(b);
		new Thread(d).start();
		Thread t1 = new Thread(d);
		t1.start();
		
	}

	public void run() {
		long b = System.currentTimeMillis();
		System.out.println("before : "+b);
		for (int j = 0; j < 4; j++) {
			do1();
			do2();
		}
		long a = System.currentTimeMillis();
		System.out.println("after : "+a);
		System.out.println("Diff : "+(a-b));
	}

	void do1() {
		try {
			Thread.sleep(1000);
			System.out.println("do1()");
		} catch (Exception e) {
			System.out.print("e ");
		}
	}

	synchronized void do2() {
		try {
			System.out.println("do2()");
			Thread.sleep(1000);
		} catch (Exception e) {
			System.out.print("e ");
		}
	}
}
