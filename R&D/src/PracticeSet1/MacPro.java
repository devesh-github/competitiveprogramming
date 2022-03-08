package PracticeSet1;

import java.io.*;
public class MacPro extends Laptop {
   public static void main(String[] args) {
     new MacPro().crunch();
   }
   // insert code here
   	void crunch() { } 
   	///Overloading is wrong 
   	//void crunch() throws Exception { }
   	
   	///Calling method have to catch the exception 
   	//void crunch(int x) throws Exception { }
   	
   	//void crunch() throws RuntimeException { }
   	
   	///Calling method have to catch the exception
   	///void crunch() throws FileNotFoundException { } 

 }
 class Laptop {
  void crunch() throws IOException { }
 }

