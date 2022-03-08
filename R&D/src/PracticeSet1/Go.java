package PracticeSet1;

class Game {
       static String s = "-";
       String s2 = "s2";
       Game(String arg) { s += arg; }
     }
public class Go extends Game {
      Go() { super("s2"); }
    { s += "i "; }
      public static void main(String[] args) {
        new Go();
        System.out.println(s);
      }
      static { s += "sb "; }
    }
