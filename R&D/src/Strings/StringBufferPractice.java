package Strings;

import java.util.Hashtable;
import java.util.Map;

public class StringBufferPractice {

	public static void method(StringBuffer sb) {
		/*sb.append(" Added");
		System.out.println(sb);
		sb = new StringBuffer("Hai");
		System.out.println(sb);*/
		
		sb = new StringBuffer("Hai");
		//System.out.println(sb);
		sb.append(" Added");
		//System.out.println(sb);
	}

	public static void main(String a[]) {
		StringBuffer sb = new StringBuffer("String Buffer");
		method(sb);
		//System.out.println(sb);
		
		Map m = new Hashtable(10,0.75f);
		//System.out.println(m.size());
		//System.out.println(m.get(10));
		
		String s1 = "Hai";
		String s2 = new String("Hai").intern();
		//System.out.println(s2);
		
		StringBuffer sb2 = new StringBuffer(8);
		sb2.append("TestString");
		System.out.println(sb2.capacity());
		System.out.println(sb2.length());
		
		
		StringBuffer stest = new StringBuffer("Prometric");
		stest.append(new StringBuffer("Test"));
		stest.delete(4, 8);
		System.out.println("StringBuffer Insert : "+stest);
		stest.insert(2,"se");
		System.out.println("StringBuffer Insert : "+stest);
		
		
		

	}

}
