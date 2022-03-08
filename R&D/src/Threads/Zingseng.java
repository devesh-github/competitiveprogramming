package Threads;

public class Zingseng extends Thread {
	public static void main(String[] args) throws Exception {
		Thread t1 = new Thread(new Zingseng());
		t1.start();
		// insert code here
			//t1.join(); 
			//t1.yield(); 
			t1.sleep(1000); 
		for (int i = 0; i < 2; i++)
			// Loop #1
			System.out.print("Loop 1 :"+Thread.currentThread().getName() + " ");
	}

	public void run() {
		for (int i = 0; i < 2; i++)
			// Loop #2
			System.out.print("Loop 2 :"+Thread.currentThread().getName() + " ");
	}
}
