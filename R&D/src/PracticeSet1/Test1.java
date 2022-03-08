package PracticeSet1;

import java.util.ArrayList;
import java.util.Collection;

public class Test1 implements I{
	
	//static int k = 0;
	//int k = 1;
	/*static void method(Object o){
		System.out.println("Object");
	}*/
	/*static void method(String o){
		System.out.println("String");
	}*/
	/*static void method(StringBuffer o){
		System.out.println("StringBuffer");
	}
	static void method(Test1 o){
		System.out.println("Test1");
	}*/
	static void method(Collection o){
		System.out.println("Collection");
	}
	static void method(ArrayList o){
		System.out.println("ArrayList");
	}
	
	public static void main(String[] args) {
		//method(null); // will call String - calls the overloaded method with sub type as argument
		//System.out.println("new Test1().k :"+new Test1().k);
		System.out.println("I.k :"+I.k);
		System.out.println("k :"+k);
	}
}

interface I {
	int k = 0;
}
