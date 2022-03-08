package Regex;

import java.text.*;
import java.util.*;
import java.util.regex.*;
import java.io.*;

public class Expons{

     static Stores st;

     public static void main(String argv[]){
          st=new Stores();
          Object ob1=getFormattedObject(Pattern.compile("H[a-d][k-m]"), "H[a-b][k-m]");
          Object ob2=getFormattedObject(st.pt1.matcher("Hello Hallo"), "[a-e][l]lo");
          Object ob3=getFormattedObject(null);
          System.out.println(ob3);
     }

     public static Object getFormattedObject(Object ob, String... s){
    	  //System.out.println(ob);
          if (ob instanceof Pattern){
               st.pt1=((Pattern)ob).compile(s[0]);
               return null;
          }else if (ob instanceof Matcher){
               st.mt1=(Matcher)ob;
               return null;
          }else{
               st.mt1.find();
               st.st1=st.mt1.group();
               return st.st1;
          }
     }
}

class Stores{
     Pattern pt1; Matcher mt1; String st1;
}