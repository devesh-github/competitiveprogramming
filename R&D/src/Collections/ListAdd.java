package Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Stack;

public class ListAdd {

	public static void main(String[] args) {
		//List list = new ArrayList();
		/*List<String> list = new ArrayList<String>();
		list.add("one");
		list.add("two");
		list.add(7);
		for(String s : list) {
		 System.out.print(s);
		 }*/
		
		ArrayList < Integer > values = new ArrayList < Integer > ();
		 values.add(4);
		 values.add(5);
		 values.set(1, 6);
		 values.remove(0);
		 for(Integer v : values) {
		 System.out.print(v);
		 }
		
		Stack < String > greetings = new Stack < String > ();
		 greetings.push("hello");
		 greetings.push("hi");
		 greetings.push("ola");
		 greetings.pop();
		 greetings.peek();
		 Iterator iter = greetings.iterator();
		 while(iter.hasNext()) {
		 System.out.print(iter.next());
		 }
	}

}
