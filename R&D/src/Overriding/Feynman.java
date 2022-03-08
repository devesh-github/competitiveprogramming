package Overriding;

import java.io.*;

class Physicist {
	static void think() throws IOException {
	}
}

public class Feynman extends Physicist {
	public static void main(String[] args) {
		try {
			new Feynman().think();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	//void think() throws Exception {}
	 static void think() throws FileNotFoundException { }
	 static void thinkk(int a) throws FileNotFoundException { }
	 protected int thinkk(int a,int b) throws RuntimeException { return 0; }
	 final int thinkk(int a,int b,int c) throws RuntimeException { return 0; }
	 
	// public void think() { }
	// protected void think() throws IOException { }
	// private void think() throws IOException { }
	// void think() { int x = 7/0; }

}
