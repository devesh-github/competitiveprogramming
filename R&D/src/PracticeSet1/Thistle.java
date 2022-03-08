package PracticeSet1;

class Weed {
	//private - this variable will not be visible to any other class
	//public - will be visible to all other class
	//static - only one copy will be shared with all the subclasses,can't be not be overridden
	//final - will not be overridden
       public static String s = "";
       void grow() { s += "grow "; }
       void growFast() { s += "fast "; }
     }
     class Thist extends Weed {
    	 //s="Sa";
       void grow() { s += "t-grow "; }
      void growFast() { s+= "t-fast "; }
    }
     public class Thistle extends Thist {
    	 //s="Sa";
       void grow() { s += "t-grow "; }
      void growFast() { s+= "t-fast "; }
      public static void main(String[] args){
    	  Weed w= new Thistle();
    	  w.grow();
    	  Weed we= new Weed();
    	  we.grow();
    	  System.out.println(s);
      }
    }

