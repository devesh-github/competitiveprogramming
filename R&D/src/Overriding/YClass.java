package Overriding;

interface XInterface{
    public abstract void runDemo();
}

abstract class XClass implements XInterface{
    String s="Java";
    public abstract void runDemo();
    {s="C++";}
}

public class YClass extends XClass implements XInterface{
    {s="C#";}
    public void runDemo(){
         System.out.println("Demo"+super.s);
    }
    public static void main(String args[]){
         XInterface xi=new YClass();
         xi.runDemo();
    }
}
