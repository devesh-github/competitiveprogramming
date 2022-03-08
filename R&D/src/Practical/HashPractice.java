package Practical;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class HashPractice {

	public static void main(String[] args) {
		SortedSet<Long> sLong = new TreeSet<Long>();
		sLong.add(Long.valueOf(22));
		sLong.add(Long.valueOf(33));
		sLong.add(Long.valueOf(44));
		
		System.out.println(sLong);

	}

}
