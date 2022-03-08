package Collections;

import java.util.*;

public class Explorer2 {
	public static void main(String[] args) {
		TreeSet<Integer> s = new TreeSet<Integer>();
		TreeSet<Integer> subs = new TreeSet<Integer>();
		for (int i = 606; i < 613; i++)
			if (i % 2 == 0)
				s.add(i);

		subs = (TreeSet) s.subSet(608, true, 611, true);
		s.add(629);
		subs.add(611);
		System.out.println(s + " " + subs);
		
		HashMap props = new HashMap();
		props.put("key45", "some value");
		props.put("key12", "some other value");
		props.put("key39", "yet another value");
		Set Set = props.keySet();
		Set = new TreeSet(Set);
		//Arrays.sort(Set);
		//Collections.sort(Set);
		//Set = new SortedSet(Set);
	}
	
	public static int sum(List<Integer> list) {
		 int sum = 0;
		 //for ( Iterator iter = list.iterator(); iter.hasNext(); ) {
		 //int i = ((Integer)iter.next()).intValue();
		 for(Integer i : list)
			 sum += i;
		 
		 return sum;
	}
	
}
