package PracticeSet1;

public class Dropkick {
    public static void main(String[] args) {
      boolean test = false;
      String[] s = {"duck", null, "frog"};
      if((s[1] == null) || (s[1].length() == 0)) System.out.print("1 ");
      if((s[2] == null) & (test = true)) System.out.print("2 ");
      if((s[0].equals("duck")) ^ (args[0].equals("fish")))
         System.out.print("3 ");
      if((args[0] != null) && (test!=false)) System.out.print("4 ");
    }
  }

