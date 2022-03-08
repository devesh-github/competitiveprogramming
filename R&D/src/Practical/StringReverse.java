package Practical;
import javax.sound.sampled.ReverbType;

public class StringReverse {

	public static void main(String[] args) {
		
		//1st
		String str = "deveshC";
		char []a = str.toCharArray();
		System.out.println(a);
		System.out.println(a.length);
		
		for (int i=0;i<a.length/2;i++) {
			//System.out.print(a[i]);
			int end = a.length-1-i;
			//System.out.print(a[end]);
			
			char temp = a[i];
			a[i] = a[end];
			a[end] = temp;
		}
		//System.out.println("\n");
		System.out.println(a);
		
		//2nd
		System.out.println(new StringBuffer(str).reverse().toString());
		
		//3rd
		System.out.println(reverseString(str));
		
		//Normal reverse - store the elements to a new array

	}
	
	public static String reverseString(String s) {
	    if (s.length() <= 1) { 
	        return s;
	    }
	    System.out.println(s.substring(1, s.length()));
	    System.out.println(s.charAt(0));
	    return reverseString(s.substring(1, s.length())) + s.charAt(0);
	}

}
