package com.test;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

public class MyQueue {

	public static void main(String[] args) {
		
		Queue qu = new ArrayDeque();
		
		qu.add(2);
		qu.add(3);
		
		System.out.println(qu);
		
		qu.offer(5);
		
		System.out.println(qu);
		
		
		

	}

}
