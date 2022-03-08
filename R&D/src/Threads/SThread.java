package Threads;

public class SThread implements Runnable{
    public void run(){
         try{
              System.out.print("A");
              sleep(1000);
              System.out.print("B");
         }catch(InterruptedException ie){
              System.out.print("Thread Interrupted");
         }
    }
    public static void main(String args[]){
         Thread t=new Thread(new SThread());
         t.start(); t.interrupt();
    }
}
