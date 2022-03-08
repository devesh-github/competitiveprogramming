package PracticeSet1;

import PracticeSet1.Numinor.Members;

public class Fellowship {
      public static void main(String[] args) {
       // insert code here
    	  	int h0 = Numinor.Members.HOBBITS.getHeight();
    	  	System.out.println(h0);
            //int h1 = Numinor.Members.getHeight();
            //int h2 = Members.HOBBITS.getHeight();
            //int h3 = Members.height;

      }
    }
class Numinor {
      enum Members {
        HOBBITS(48), ELVES(74), DWARVES(50);
        int height;
        Members(int h) { height = h; }
        int getHeight() { return height; }
     }
}

