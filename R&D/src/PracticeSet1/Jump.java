package PracticeSet1;

class Paratrooper implements Runnable {
      public void run() {
        System.out.print(Thread.currentThread().getName() + " ");
} }
    public class Jump {
      static Paratrooper p;
      static { p = new Paratrooper(); }
      { Thread t1 = new Thread(p, "bob"); t1.start(); }
      public static void main(String[] args) {
        new Jump();
        new Thread(new Runnable() { public void run()
             { ; }}, "carol").start();
        new Thread(new Paratrooper(), "alice").start();
      }
      Jump() { Thread t2 = new Thread(p, "ted"); t2.start(); }
    }

