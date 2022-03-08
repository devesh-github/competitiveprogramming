package Threads;

public class Threads5 implements Runnable{
	public static void main(String[] args) {
		//new Threads5().go();
		Thread t = new Thread(new Threads5());
		t.start();
		t.start();
	}

	public void go() {
		Runnable r = new Runnable() {
			public void run() {
				System.out.print("foo");
			}
		};
		Thread t = new Thread(r);
		t.start();
		t.start();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
}
