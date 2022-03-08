package PracticeSet1;

public class Later {
       public static void main(String[] args) {
         /*boolean earlyExit = new Later().test1(args);
         if(earlyExit) assert true;
         new Later().test2(args);*/
    	   String s = "1234";
            StringBuilder sb =
              new StringBuilder(s.substring(2).concat("56").replace("6","7"));
            System.out.println(sb.append("89").insert(3,"x").reverse());

       }
       boolean test1(String[] a) {
    	   System.out.println("1");
         if (a.length == 0) return false;
         System.out.println("2");
        return true;
      }
      private void test2(String[] a) {
    	  System.out.println("3");
        if (a.length == 2) assert false;
        System.out.println("4");
    } }

