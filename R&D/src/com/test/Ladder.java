package com.test;

import java.util.Scanner;

public class Ladder {
	public static void main(String[] args) {
		/*try {
			System.out.println(doStuff(args));
		} catch (Exception e) {
			System.out.println("exc");
		}
		doStuff(args);*/
		/*String in = "1234,777";
		//String in = "1,123";
        Scanner sc = new Scanner(in);
        sc.useDelimiter(",");
        while(sc.hasNext()){
        	System.out.print(sc.nextShort() + " ");
           System.out.print(sc.nextInt() + " ");
           System.out.print(sc.nextShort() + " ");
        }
        while(sc.hasNext())
           System.out.print(sc.nextShort() + " ");*/
		processAge2(5);
	}

	static int doStuff(String[] args) {
		return Integer.parseInt(args[0]);
	}
	
	private static void processAge2(int age) {
		//assert (age > 10);
		assert (age > 10) : 10;
		System.out.println("Processing age ...");
	}
}
