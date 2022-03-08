package com.test;

public class StringCompress {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String str = "AAABBBCCD";
		char []strArray = str.toCharArray();
		String st = null;
		//int count =0;
		
		for (int i=0;i<strArray.length;i++)
		{
			int count =1;
			char element = strArray[i];
			for(int j=i+1;j<strArray.length;j++) {
				if(element == strArray[j]) {
					count++;
					continue;
				} else {
					break;
				}
			}
			
			if(st == null) {
				st = String.valueOf(element) + count;
			} else {
				st = st + String.valueOf(element) + count;
			}
			
			i = i+count-1;
		}
		System.out.println(st);

	}
	
	public long multiply (int a, int b) {
		return a * b ;
	}

}
