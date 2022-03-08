package Collections;

import java.util.ArrayList;

public class ArrayListConversion {
	
	public static void main(String[] args) {
		String str = "00:02:05,130 --> 00:02:10,130";
		//String[] str_array = str.split(" --> ");


		String[] str_array = str.split("\\s*-->\\s*");
		String stringa = str_array[0]; 
		String stringb = str_array[1];
		System.out.println(stringa);
		
		String[] tokens = str.split(" --> ");
	    System.out.println(tokens.length);
	    for(String s : tokens)
	        System.out.println(s);
	}
	


}
