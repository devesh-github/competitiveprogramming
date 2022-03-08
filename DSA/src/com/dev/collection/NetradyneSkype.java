package com.dev.collection;

public class NetradyneSkype {
	public static void main(String[] args) {
		System.out.println("Hello World");
		NetradyneSkype hw = new NetradyneSkype();
		//hw.printCustomMessage(Integer.parseInt(args[0]));
		hw.printCustomMessage(15);
		int[] inpArr= {1,2,3,4,5};
		hw.reverseArr(inpArr);
	}

	
	public void printCustomMessage(int inpNo) {
		for (int i=1;i<=inpNo;i++) {
			if(i%3==0 && i%5==0) {
				System.out.println("FizzBuzz");
			} else if(i%3==0) {
				System.out.println("Fizz");
			} else if(i%5==0) {
				System.out.println("Buzz");
			} else {
				System.out.println(i);				
			}
		}
	}
	
	public void reverseArr(int[] inpArr) {
		int arrLen = inpArr.length;
		int temp;
		for (int i=0,j=arrLen-1;i<=arrLen/2;i++,j--) {
			temp = inpArr[i];
			inpArr[i] = inpArr[j];
			inpArr[j] = temp;
		}
		
		for (int i=0;i<arrLen;i++) {
			System.out.println(inpArr[i]);
		}
	}
}
