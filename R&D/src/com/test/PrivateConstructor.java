package com.test;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class PrivateConstructor {

	protected PrivateConstructor() {
		System.out.println("Inside constructor");
	}

	public static void main(String[] args) {
		PrivateConstructor pc = new PrivateConstructor();
		List<String> li = new LinkedList<String>();
		li.add("I am a disko dancer");
		li.add("You are also disko dancer");
		System.out.println(li);

		Object[] a = (Object[]) li.toArray();
		String[] a1 = new String[a.length];
		for (int i = 0; i < a.length; i++) {
			String s = (String) a[i];
			//Do the formatting as per the need
			String subString = s.substring(0, s.length()/2); 
			s = s.replace(subString, subString+"\n");
			a1[i] = s;
		}

		List<String> list = Arrays.asList(a1);
		for(String aa : list)
			System.out.println(aa);
		
		Scanner sc = new Scanner("text.txt");
	}
	
	public String getValue(){
		return "Hi Buddy";
	}

}
