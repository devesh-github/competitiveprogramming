package PracticeSet1;

import java.util.ArrayList;
import java.util.List;
import java.util.LinkedList;

public class Networking {
       public static void main(String[] args) {
         List<Integer> i = new ArrayList<Integer>();
         i.add(4); i.add(2); i.add(5);
         int r = 1;
         doStuff(r);
         System.out.println(i);
         System.out.println(i.get(r));
       }
      static int doStuff(int x) {
        return ++x;
    } }

