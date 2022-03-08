package com.test;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class FindAndRemoveDuplicateElementsFromString {

	
	public static void main(String[] args) {
		
		String str = "Devesh Amar Rahul dev a Devesh";
		Set<String> sString = new TreeSet<String>();
		
		Scanner sc = new Scanner(str).useDelimiter(" ");
		while(sc.hasNext())
		{
			String element = sc.next();
			//System.out.println(element);
			if(sString.contains(element))
				System.out.println(element);
			sString.add(element);
		}
		System.out.println(sString);

	}

}
