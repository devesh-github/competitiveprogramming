package Collections;

import java.util.*;

public class Example {
	public static void main(String[] args) {

		// Set set = new TreeSet(); //[1, 2]
		 Set set = new HashSet(); //Cant predict order/unsorted too
		// Set set = new SortedSet(); //SortedSet is an interface, cant
		// instantiate it
		// List set = new SortedList(); //There is no class called SortedList
		// Set set = new LinkedHashSet(); //Ordered HashSet

		set.add(new Integer(2));
		set.add(new Integer(1));
		set.add(new Integer(4));
		set.add(new Integer(5));
		set.add(new Integer(6));
		System.out.println(set);
	}
}