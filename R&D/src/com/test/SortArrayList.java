package com.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
 
public class SortArrayList{
 
	public static void main(String args[]){
 
		List<String> unsortList = new LinkedList<String>();
 
		unsortList.add("CCC");
		unsortList.add("111");
		unsortList.add("AAA");
		unsortList.add("BBB");
		unsortList.add("ccc");
		unsortList.add("bbb");
		unsortList.add("aaa");
		unsortList.add("333");
		unsortList.add("222");
 
		//before sort
		System.out.println("ArrayList is unsort");
		for(String temp: unsortList){
			System.out.println(temp);
		}
 
		//sort the list
		Collections.sort(unsortList);
 
		//after sorted
		System.out.println("ArrayList is sorted");
		for(String temp: unsortList){
			System.out.println(temp);
		}
	}
 
}
