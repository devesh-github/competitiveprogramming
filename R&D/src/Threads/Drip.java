package Threads;

import java.util.Date;

public class Drip extends Thread {
	public static void main(String[] args) {
		/*
		 * Thread t1 = new Thread(new Drip()); t1.start(); try { t1.join(); }
		 * catch (InterruptedException e) { // TODO Auto-generated catch block
		 * e.printStackTrace(); } for (int i = 0; i < 5; i++) // Loop #1
		 * System.out.print(Thread.currentThread().getName() + " ");
		 */

		int x = 3;
		for (int i = 0; i < 3; i++) {
			if (i == 1)
				x = x++;
			if (i % 2 == 0 && x % 2 == 0)
				System.out.print(".");
			if (i % 2 == 0 && x % 2 == 1)
				System.out.print("-");
			if (i == 2 ^ x == 4)
				{System.out.println(x);
				System.out.print(",");}
		}
		System.out.println("<");
		
		Date d1 = new Date();
		Date d2 = d1;
		System.out.println(d1);
		d2.setTime(d1.getTime() + (7 * 24 * 60 * 60));
		System.out.println(d2);

	}

	public void run() {
		for (int i = 0; i < 5; i++)
			// Loop #2
			System.out.print(Thread.currentThread().getName() + " ");
	}
}
