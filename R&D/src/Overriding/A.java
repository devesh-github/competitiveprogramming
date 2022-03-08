package Overriding;

public class A{

    private String runNow(){
         return "High";
    }

    static class B extends A{
         public String runNow(){
              return "Low";
         }
    }

    public static void main(String args[]){
         A[] a=new B[]{new B(),new C()};
         for(A aa:a)
         {
              System.out.print(aa.runNow()+" ");
         }
         A ad = new D();
         System.out.println(ad.runNow());
    }

}


class C extends A.B{

    public String runNow(){
         return "Out";
    }

}

class D extends A {
	public String runNow(){
        return "High";
   }
}
