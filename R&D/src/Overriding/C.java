package Overriding;

class A{

    private final class B extends A{      // Line-1
         public final void printText(){  // Line-2
              System.out.print("News");
         }		
    }

    private final void printText(){        // Line-3
         System.out.print("Educational");
    }

    protected A getContext(){ 
         return new B(); // Line-4
    }

}

public class C extends A{ 

    public final class B{                 // Line-5
         private final void printText(){  // Line-6
              System.out.print("Sports");
         }
    }

    private final static void printText(){     // Line-7
         System.out.print("Lectures"); 
    }

    public static void main(String args[]){
         A a=new A();                   // Line-8
         a.getContext().printText();    // Line-9
    }

}
