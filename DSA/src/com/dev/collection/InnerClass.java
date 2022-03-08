package com.dev.collection;

class Outer {
	class Inner {
		void runMeInstance() {
			System.out.println("Inside Outer-Inner-runMeInstance");
		}
	}

	static class InnerStatic {
		void runMeInstance() {
			System.out.println("Inside Outer-InnerStatic-runMeInstance");
		}
	}
}

public class InnerClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*Outer.Inner out = new Outer.Inner();
	    out.runMeInstance();*/
	    
	    Outer out = new Outer();
	    Outer.Inner in = out.new Inner();
	    in.runMeInstance();

	    Outer.InnerStatic inner = new Outer.InnerStatic();
	    inner.runMeInstance();
	}

}
