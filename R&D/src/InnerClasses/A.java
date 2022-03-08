package InnerClasses;

public class A{
    static class B extends A{
         public void capture(){  System.out.print("Cap:A.B");  }
    }
    static class C extends B{
         public void capture(){  System.out.print("Cap:A.C");  }
    }
    public void capture(){ System.out.print("Cap:A"); }

    public static void main(String args[]){
         A ob=new C();
         ob.capture();
    }
}
