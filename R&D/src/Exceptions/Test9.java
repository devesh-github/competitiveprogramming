package Exceptions;

public class Test9 extends A{
    /*public static void main(String args[]) throws Exception{
        Test9 t = new Test9();
    }*/
	Test9()throws Exception{
        System.out.println("Test10 Class");
    }
    Test9(int i) {}
    public static void main(String args[]) throws Exception{
        Test9 t = new Test9();
    }
}
class A{
    A() throws Exception{
        System.out.println("A Class");
    }
}

