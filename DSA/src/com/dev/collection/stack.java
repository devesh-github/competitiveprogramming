package com.dev.collection;

import java.util.ArrayList;

public class stack {

	public static void main(String[] args) {
		
		ArrayList<Integer> intArrList = new ArrayList<Integer>();
		
		/*intArrList.add(0, 01);
		intArrList.add(2, 10);
		intArrList.add(1, 20);*/
		
		intArrList.add(01);
		intArrList.add(10);
		intArrList.add(20);
		intArrList.remove(1);
		
		/*for(int i:intArrList) {
			System.out.println(i);
		}*/
		
		//String[] str = {"abc","def","45"};
		String[] str = new String[10];
		push(str,"dev");
		push(str,"raam");
		
		for(String instr:str) {
			if(instr!=null) {
				System.out.println(instr);
			}
		}
		
		System.out.println("Poped Value::"+pop(str));
	}
	
	static int push(String[] str,String in) {
		int i=0;
		if(str[str.length-1]==null){
			while(str[i]!=null)
				i++;
			str[i]=in;
		}
		return i;
	}
	
	static String pop(String[] str) {
		int i=0;
		String popedVal = null;
		for(String stackArr: str) {
			if(stackArr!=null) {
				popedVal = str[i];
				i++;
			}
		}
		
		str[i-1]=null;
		return popedVal;
	}
}
