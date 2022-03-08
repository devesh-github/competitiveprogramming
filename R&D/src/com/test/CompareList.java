package com.test;

import java.util.*;

public class CompareList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<String> ls1 = new ArrayList<String>();
		ls1.add("A");
		ls1.add("B");
		ls1.add("C");
		
		List <String> ls2 = new ArrayList();
		ls2.add("A");
		ls2.add("B");
		ls2.add("C");
		
		System.out.println(ls1.containsAll(ls2));
		
	}

}
