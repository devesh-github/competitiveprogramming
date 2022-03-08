package Regex;

import java.util.regex.*;
 public class Decaf {
   public static void main(String[] args) {
     /*Pattern p = Pattern.compile(args[0]);
     Matcher m = p.matcher(args[1]);
     while(m.find())
       System.out.print(m.group() + " ");*/
	   
     String test = "Test A. Test B. Test C.";  
     //String regex = "";
     //String regex = " ";
     //String regex = ".*";
     //String regex = "\\s";
     //String regex = "\\.\\s*";
     //String regex = "\\.\\*";
     /*String regex = "\\w[ \\.] +";
     String[] result = test.split(regex);
     for(String s:result)
    	 System.out.println(s);*/
     
     
     String test1 = "This is a test";
     String token[] = test1.split("\\s");
     System.out.println(token.length);
     
 } }
 
//I.	java Decaf "0([0-7])?" "1012 0208 430" -- 01 02 0 0 
//II.	java Decaf "0([0-7])*" "1012 0208 430" -- 012 020 0
//III.	java Decaf "0([0-7])+" "1012 0208 430" -- 012 020 


