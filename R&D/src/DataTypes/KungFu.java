package DataTypes;

import java.util.List;

public class KungFu {
	public static void main(String[] args) {
		Integer x = 400;
		Integer y = x;
		System.out.println(x == y);
		x++;
		System.out.println(x);
		System.out.println(y);
		
		Integer x1 = new Integer(500);
		Integer y1 = new Integer(500);
		System.out.println(x1 == y1);
		x1++;
		System.out.println(x1);
		System.out.println(y1);
		System.out.println(x1 == y1);
		
		StringBuffer sb1 = new StringBuffer("123");
		StringBuffer sb2 = sb1;
		sb1.append("5");
		System.out.println(sb1);
		System.out.println(sb2);
		
		System.out.println((x == y) + " " + (sb1 == sb2));
		
		String s1 = new String("123");
		String s2 = new String("123");;
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		s1.concat("5");
		System.out.println(s1);
		System.out.println(s2);
		
		
	}
	void add(List a){
		a.add("aa");
	}
}
