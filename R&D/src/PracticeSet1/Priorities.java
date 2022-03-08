package PracticeSet1;

import java.util.*;
class Priorities {
   public static void main(String[] args) {
     PriorityQueue<String> toDo = new PriorityQueue<String>();
     toDo.add("dishes");
     toDo.add("laundry");
     toDo.add("bills");
     System.out.println(toDo);
     toDo.offer("bills");
     System.out.println(toDo.size() + " " + toDo.poll());
     System.out.println(" " + toDo.peek() + " " + toDo.poll());
     System.out.println(" " + toDo.poll() + " " + toDo.poll());
     System.out.println(toDo);
 } }

