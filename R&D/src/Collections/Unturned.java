package Collections;

import java.util.*;
 public class Unturned {
   public static void main(String[] args) {
     String[] towns = {"aspen", "vail", "t-ride", "dillon"};
     MySort ms = new MySort();
     Arrays.sort(towns, ms);
     for(String s : towns){
    	 System.out.println(s);
     }
     System.out.println(Arrays.binarySearch(towns, "vail"));
   }
   static class MySort implements Comparator<String> {
     public int compare(String a, String b) {
       return a.compareTo(b);
 } } }

