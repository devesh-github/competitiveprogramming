package com.test;

class Contact {
       String doStuff() { return "howdy "; }
     }
class Supplier extends Contact {
   String doStuff() { return "send money "; }
   public static void main(String[] args) {
    Supplier s1 = new Supplier();
    Contact c3 = new Contact();
    Contact c1 = s1;
    Supplier s2 = (Supplier) c1;
    //Supplier s3 = (Supplier) c3;
    
    //Compilation Error
    //Supplier s4 = new Contact();
   } 
}

