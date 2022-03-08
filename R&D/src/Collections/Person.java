package Collections;

import java.io.PrintStream;
import java.util.*;

public class Person {
	 private String name;
	 public Person(String name) {
		 this.name = name;
	 }
	 public int hashCode() {
		 return 420;
	 }
	 
	 public static void main(String[] args) {
		 ArrayList<Integer> a = new ArrayList<Integer>();
		 a.add(1); a.add(5); a.add(3);
		 Collections.sort(a);
		 a.add(2);
		 Collections.reverse(a);
		 System.out.println(a);
		 
		 PrintStream c=new PrintStream(System.out);
		 c.println("dfsaf");
		 
	 }
}
