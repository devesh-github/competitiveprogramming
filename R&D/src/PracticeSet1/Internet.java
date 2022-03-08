package PracticeSet1;

public class Internet {
       private int y = 8;
       
       public static void main(String[] args) {
         new Internet().go();
       }
       void go() {
         final int y = 7;
         class TCPIP {
        	 int y = 9;
             void doit() { System.out.println(y + y); }
           }
        TCPIP ip = new TCPIP();
        /*class TCPIP {
          void doit() { System.out.println(y + x); }
        }*/
        ip.doit();
      }
    }

