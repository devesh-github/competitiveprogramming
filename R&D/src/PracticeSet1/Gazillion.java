package PracticeSet1;

import java.text.*;
 public class Gazillion {
   public static void main(String[] args) throws Exception {
     String s = "123.456";
     NumberFormat nf = NumberFormat.getInstance();
     System.out.println(nf.parse(s));
     nf.setMaximumFractionDigits(0);
     float it = 123.456f;
     System.out.println(nf.format(it));
   }
 }
