package PracticeSet1;

/*public class Test5{
    public static void main(String args[]){
        System.out.println(I2.k);
    }
}
interface I2{
    int k=9;
}*/

/*public class Test8{
    final static int k;
    static{
       //k = k * 2;
    	k=0;
       System.out.println("Inside static :"+k);
    }
    {
       //k = k * 2;
       System.out.println("Inside initialization block "+k);
    }
    public static void main(String args[]){
    	
       System.out.println(k);
       Test8 t = new Test8();
    }
}*/

interface I2{}
class A2 implements I2{}
class BB implements I2{}

public class Test8{
    public static void main(String args[]){
        I2 i1 = new A2();
        I2 i2 = new BB();
        A2 a = new A2();
        System.out.println(i1 instanceof I2);
        System.out.println(i1 instanceof A2);
        
        System.out.println(i2 instanceof I2);
        System.out.println(i2 instanceof BB);
        
        System.out.println(a instanceof I2);
        System.out.println(i1 instanceof BB);
        
        int[] a2  = new int[2];
        System.out.println(null instanceof Object);
       
    }
}
