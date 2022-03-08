package com.dev.collection;

import java.util.Iterator;
import java.util.TreeMap;

public class FindSmallestPositiveInt {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int arr[] = {-10, -20,5};
		
		System.out.println( new FindSmallestPositiveInt().solution(arr));
	}

	TreeMap<Integer, Object> all = new TreeMap<Integer, Object>();

	public int solution(int[] A) {

		for (int i = 0; i < A.length; i++)
			all.put(i + 1, new Object());

		for (int i = 0; i < A.length; i++)
			if (all.containsKey(A[i]))
				all.remove(A[i]);
		
		System.out.println(all);

		Iterator notOccur = all.keySet().iterator();
		if (notOccur.hasNext())
			return (Integer) notOccur.next();

		return 1;

	}

}
