package Exceptions;

public class Test21{
    public static void main(String args[]) {
        Test21 t;
        //t.method();
        int i=5;
        int j = i+++i++;
        System.out.println(j);
        char[] c = new char[20];
        System.out.println(c[11]);
        //new float[2]={1,2};
        boolean b = true;
        Test21 t21 = null;
        t21.method();
    }
    public static void method(){
        System.out.println("NPE");
    }
}
