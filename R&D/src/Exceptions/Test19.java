package Exceptions;

public class Test19 {
    float f;
    Test19(){
       this(f);
       f = 3;
    }
    Test19(float f){
       System.out.println(f);
    }
    public static void main(String args[]) {
       Test19 t = new Test19();
    }
}
