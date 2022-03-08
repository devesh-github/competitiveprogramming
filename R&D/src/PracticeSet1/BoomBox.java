package PracticeSet1;

class Stereo { void makeNoise() { System.out.println("oo");assert true; } }
 public class BoomBox extends Stereo {
   public static void main(String[] args) {
     new BoomBox().go(args);
   }
   void go(String[] args) {
    if(args.length >= 0) 
    {System.out.println("ii");makeNoise();}
     if(!args[0].equals("x")) System.out.println("!x");
 } }

