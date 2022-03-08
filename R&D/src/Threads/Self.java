package Threads;

public class Self extends Thread {
	public static void main(String[] args) {
		/*try {
			Thread t = new Thread(new Self());
			t.start();
			t.start();
		} catch (Exception e) {
			System.out.print("e ");
		}*/
		
		//new Self().make();
	}

	public Self(){
		start();
	}
	public void run() {
		for (int i = 0; i < 2; i++)
			System.out.print(Thread.currentThread().getName() + " ");
	}
}
