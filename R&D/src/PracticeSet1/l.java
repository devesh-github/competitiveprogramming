package PracticeSet1;

public class l {
	static String s = "";
    public static void main(String[] args) {
       try { doStuff(); }
       catch (Exception ex) { s += "c1 "; }
       System.out.println(s);
     }
     static void doStuff() throws RuntimeException {
       try {
         s += "t1 ";
         throw new NullPointerException();
       }
       catch (NullPointerException ie) { s += "c2 "; }
       throw new NullPointerException();
     }
}
