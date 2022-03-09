/*Copyright (c) May 26, 2018 CareerMonk Publications and others.
 * E-Mail           	: info@careermonk.com 
 * Creation Date    	: 2015-01-10 06:15:46 
 * Last modification	: 2006-05-31 
               by		: Narasimha Karumanchi 
 * File Name			: MaxGuestSol.java
 * Book Title			: Data Structures And Algorithms Made In Java
 * Warranty         	: This software is provided "as is" without any 
 * 							warranty; without even the implied warranty of 
 * 							merchantability or fitness for a particular purpose. 
 * 
 */


package com.geeksforgeeks;

import java.util.Arrays;

public class MaxGuestSol {

	/**
	 * @param args
	 */
	
	public static void maxOverlap(int []start,int [] end ,int n)
	{
	       // Finding maximum starting time
	       int maxa = Arrays.stream(start).max().getAsInt();
	      
	       // Finding maximum ending time
	       int maxb = Arrays.stream(end).max().getAsInt();
	      
	       int maxc=Math.max(maxa,maxb); 
	          
	       int []x = new int[maxc+2];
	       Arrays.fill(x, 0);
	          
	        int cur=0,idx=0;
	       // CREATING AN AUXILIARY ARRAY
	        for(int i=0;i<n;i++)
	        {// Lazy addition
	         ++x[start[i]];
	         --x[end[i]+1];
	        }
	           
	        int maxy=Integer.MIN_VALUE;
	        //Lazily Calculating value at index i
	        for(int i=0;i<=maxc;i++) 
	        {
	           cur+=x[i];
	           if(maxy<cur)
	           {maxy=cur;idx=i;}           
	        }
	        System.out.println("Maximum value is:"+
	                           maxy+" at position: "+idx+"");
	           
	}
	
	public static void main(String[] args) {

		int [] start = new int[]{13, 28, 29, 14, 40, 17, 3 };
        int [] end   = new int[]{107, 95, 111, 105, 70, 127, 74};
        int n=start.length;
      
         maxOverlap(start,end,n);

		
	}

}
