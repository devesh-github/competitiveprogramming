package com.test;

import java.util.*;
 public class MyUtil extends ArrayList {
   public static void main(String[] args) {
     MyUtil m = new MyUtil();
     m.add("w"); m.add("x"); m.add("y"); m.add("z");
     m.removeRange(1,3);
     System.out.print(m.size() + " ");
     System.out.println(m + " ");
     
   /* MyUtil m2 = new MyUtil2().go();
    System.out.print(m2.size() + " ");
    System.out.print(m2);*/
     
  }
   /*protected void removeRange(MyUtil m, int fromIndexInclusive, int toIndexExclusive){
	   for(;fromIndexInclusive<toIndexExclusive;){
		   //System.out.println( "f" +"d");
		   //System.out.print(m);
		   //System.out.println(" "+m.get(fromIndexInclusive));
		   m.remove(toIndexExclusive);
		   toIndexExclusive--;
	   }
   }*/
   protected void range(MyUtil m, int fromIndexInclusive, int toIndexExclusive){
	   
   }
 }
 class MyUtil2{
   /*MyUtil go() {
     //MyUtil m2 = new MyUtil();
     //m2.add("1"); m2.add("2"); m2.add("3");
     //m2.removeRange(m2,1,2);
     removeRange(1,2);
     return m2;
 }*/
	 void go(){
		 MyUtil m2 = new MyUtil();
		 m2.range(null, 0, 0);
		 }
}
/* 
 class MyUtil3{
		 void go2(){
			 MyUtil m2 = new MyUtil();
			 m2.range(null, 0, 0);
		 }
	}*/

