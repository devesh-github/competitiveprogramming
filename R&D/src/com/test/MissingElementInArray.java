package com.test;

public class MissingElementInArray {

	public static void main(String[] args) {

		int[] a = { 0, 1, 2,  3, 4, 5,  6,7, 8, 10, 11, 12 ,13,14,15,16,17};
		int length = a.length;
		final int sum = a[0] + a[length - 1];
		int median = length / 2;

		System.out.println("length : " + length);
		System.out.println("sum : " + sum);
		System.out.println("Median : " + median);

		int count = 0;
		for (int i = 0, j = length - 1; i <= median; i++, j--) {
			count = i;
			if (a[i] + a[j] == sum) {
				System.out.print(a[i]);
				System.out.println(" "+a[j]);
				continue;
			} else if (a[i] == a[j]){
				System.out.println("Missing Element is a["+ j +"] = "+(a[i]+1) );
			} else {
				if (a[j] == (a[j + 1] + 1)) {
					System.out.println("Missing Element is a["+ j +"] = "+(a[j+1]-1) );
					//System.out.println("Previous Element is "+ a[i-1]);
					break;
				} else {
					System.out.println(i);
					System.out.println("Missing Element is a["+ i +"] = "+(a[i-1]+1) );
					//System.out.println("next Element is "+ a[j+1]);
					break;
				}
			}
		}
		if (count == median) {
			System.out.println("No missing Element");
		}
	}

}

//Complexity
/*N+1+1+1 =n+3
1+n/2+n/2 =n+1 
	n/2+n/2+n/2 = 3n/2
			n+1+3n/2 = 5n/2+1
1
(n+3) + (5n/2 +1) +1 = 7n/2 + 5

Complexity is = O(7n/2 + 5) = O(n/2)*/