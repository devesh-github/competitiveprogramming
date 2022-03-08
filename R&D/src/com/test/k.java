package com.test;

import java.util.Scanner;

public class k {
	class A {
		long process() throws Exception {
			throw new Exception();
		}
	}

	class B extends A {
		// long process() throws ArrayIndexOutOfBoundsException{
		// System.out.println("B"); return 10;}
		long process() {
			System.out.println("B");
			return 10;
		}
	}

	public static void main(String[] args) {
		//new k().new B().process();
		String csv = "Sue 5 true 3";
		Scanner scanner = new Scanner(csv);
		scanner.useDelimiter(" ");
		System.out.println("Scanner :: "+scanner);

		while(scanner.hasNext())
			System.out.println(scanner.next());
		
		String input = "1 fish 2 fish red fish blue fish";
	     Scanner s = new Scanner(input).useDelimiter("\\s*fish\\s*");
	     System.out.println(s.nextInt());
	     System.out.println(s.nextInt());
	     System.out.println(s.next());
	     System.out.println(s.next());
	     s.close(); 
	     
	     /*while(s.hasNextInt())
				System.out.println(s.next());*/
	}
}