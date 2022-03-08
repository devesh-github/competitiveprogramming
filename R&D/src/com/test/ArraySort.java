package com.test;

public class ArraySort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//Logic
		int []a = {1,4,5,2,3};
		Integer b[] = {1,4,5,2,3};
		
		for (int i=0;i<b.length;i++) {
			for (int j=i;j<b.length-1;j++) {
				if (b[j] > b[j+1]) {
					int temp = b[j];
					b[j] = b[j+1];
					b[j+1] = temp;
				}
			}
		}
		
		for (int i=0;i<b.length;i++) {
			System.out.println(b[i]);
		}
		//PrivateConstructor pc = new PrivateConstructor();
		//System.out.println(pc.getValue());
		

	}

}
