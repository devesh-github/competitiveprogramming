package com.StackOverFlow;

import java.io.*;

class FileCopy
{
   public static void main(String[] args) 
   {
      try 
      {
         /*File fileIn  = new File("C:\\Users\\devesh.kumar.chaubey\\Desktop\\Assign4.txt");
         File fileOut = new File("target.txt");

         FileInputStream streamIn   = new FileInputStream(fileIn);
         FileOutputStream streamOut = new FileOutputStream(fileOut);

         int c;
         while ((c = streamIn.read()) != -1) 
         {
        	 System.out.println(c);
            streamOut.write(c);
         }

         streamIn.close();
         streamOut.close();*/
    	  
    	  BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\devesh.kumar.chaubey\\Desktop\\Assign4.txt"));
    	  BufferedWriter writer = new BufferedWriter( new FileWriter("target.txt"));
    	      try {
    	          int count = 1;  
    	          StringBuilder sb = new StringBuilder();
    	          String line = br.readLine();            
    	          while (br.readLine() != null) {
    	              sb.append(count++);
    	              sb.append(br.readLine());
    	              sb.append("\n");
    	              writer.write(sb.toString());
    	              //line = br.readLine();    
    	          }
    	      } finally {
    	          br.close();
    	          writer.close();
    	      }
      }
      catch (FileNotFoundException e) 
      {
         System.err.println("FileCopy: " + e);
      } 
      catch (IOException e) 
      {
         System.err.println("FileCopy: " + e);
      }
   }
}
