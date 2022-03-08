package com.dev.tree;

//you can also use imports, for example:
import java.util.HashSet;
import java.util.Set;
//you can write to stdout for debugging purposes, e.g.
//System.out.println("this is a debug message");

class Solution {
	public int solution(int[] A) {
		// write your code in Java SE 8
		// int[] b = Arrays.sort(A);
		/*
		 * Arrays.sort(A); System.out.println(A.length); for(int
		 * i=0;i<A.length;i++) { /*if(b[i]!=b[i+1]) { return b[i]+1; }
		 */
		/*
		 * System.out.println(A[i]); if(!(i+1>=A.length) && A[i]!=A[i+1] &&
		 * A[i]+1!=A[i+1]) { if(A[i]!=0 && A[i]<0) { return A[i]+1; }else {
		 * return 1; } } }
		 * 
		 * return 1;
		 */

		int N = A.length;
		Set<Integer> set = new HashSet<Integer>();
		for (int a : A) {
			if (a > 0) {
				set.add(a);
			}
		}
		for (int i = 1; i <= N + 1; i++) {
			if (!set.contains(i)) {
				return i;
			}
		}

		return 1;
	}

	int solution2(int[] A) {
		int n = A.length;

		// To mark the occurrence of elements
		boolean[] present = new boolean[n + 1];

		// Mark the occurrences
		for (int i = 0; i < n; i++) {

			// Only mark the required elements
			// All non-positive elements and
			// the elements greater n + 1 will never
			// be the answer
			// For example, the array will be {1, 2, 3}
			// in the worst case and the result
			// will be 4 which is n + 1
			if (A[i] > 0 && A[i] <= n)
				present[A[i]] = true;
		}

		// Find the first element which didn't
		// appear in the original array
		for (int i = 1; i <= n; i++)
			if (!present[i])
				return i;

		// If the original array was of the
		// type {1, 2, 3} in its sorted form
		return n + 1;
	}

	// main function
	public static void main(String[] args) {
		//int arr[] = { 0, 10, 1, 2, -10, -20 };
		 int arr[] = { -10, -20 };
		int arr_size = arr.length;
		int missing = new Solution().solution2(arr);
		System.out
				.println("The smallest positive missing number is " + missing);
	}

}