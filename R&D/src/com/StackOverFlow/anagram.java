package com.StackOverFlow;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;

public class anagram {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testcases = Integer.parseInt(br.readLine());
		//int testcases = 5;
		System.out.println("hello");
		HashMap<String, Integer> mymap = new HashMap<String, Integer>();
		for (int entry = 97; entry < 123; entry++) {
			String ekey = String.valueOf((char) entry);
			mymap.put(ekey, 0);
		}

		for (int loop1 = 1; loop1 == testcases; loop1++) {

			String a = br.readLine();
			String b = br.readLine();

			System.out.println(a);
			System.out.println(b);

			System.out.println("111111111111");
		}
	}
}
