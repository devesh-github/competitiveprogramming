package com.test;

import java.util.*;
 public class Drunken {
   public static void main(String[] args) {
     Set<Stuff> s = new HashSet<Stuff>();
     s.add(new Stuff(3)); s.add(new Stuff(4)); s.add(new Stuff(4));
     s.add(new Stuff(5)); s.add(new Stuff(6));
     Iterator set = s.iterator();
     while(set.hasNext())
    	 System.out.println(set.next());
     
     
     Set s2 = new HashSet();
     s2.add(new Integer(2));
     //s2.add(new Integer(2));
     s2.add(3);
     s2.add(4);
     //s2.add("2");
     for(Object st : s2)
    	 System.out.println(st);
     s = null;
     // do more stuff
  }
 }
 
 class Stuff {
   /* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Stuff [value=" + value + "]";
	}
	int value;
    Stuff(int v) { value = v; }
}


