package com.dev.collection;

import java.util.*;

//you can write to stdout for debugging purposes, e.g.
//System.out.println("this is a debug message");

public class Solution {

	public static void main(String[] args) {
		//int arr[] = { -10, -20, 5 };
		//int arr[] = {1, 3, 6, 4, 1, 2};
		//int arr[] = {1, 2,3};
		//int arr[] = {-1,-3};
		int arr[] = {-1,1,3,45};

		System.out.println(new Solution().solution(arr));
	}

	public int solution(int[] A) {
		// write your code in Java SE 8
		Map<Integer, Integer> inMap = new TreeMap<Integer, Integer>();
		for (int i = 0; i < A.length; i++) {
			inMap.put(A[i], i);
		}
		System.out.println(inMap);

		int start = (Integer) (inMap.keySet().toArray()[0]);
		for (int i = 0; i < A.length; i++, start++) {
			if ((Integer) inMap.keySet().toArray()[i] == start) {
				if(i+1==A.length) {
					return start+1;
				}
				continue;
			} else {
				if (start > 0)
					return start;
			}
			if(start==0) start++;
		}
		return 1;
	}
}
