package PracticeSet1;

class SuperCool {
      static String os = "";
      void doStuff() { os += "super "; }
    }
    public class Cool extends SuperCool {
      public static void main(String[] args) {
        new Cool().go();
      }
     void go() {
       SuperCool s = new Cool();
       Cool c = (Cool)s;
       // insert code here
       	c.doStuff(); 
       	s.doStuff(); 
        this.doStuff(); 
    	super.doStuff(); 

     }
     void doStuff() { os += "cool "; }
    }

