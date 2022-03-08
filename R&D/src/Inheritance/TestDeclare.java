package Inheritance;

import java.util.LinkedList;
import java.util.List;

interface DeclareStuff {
	public static final int EASY = 3;

	void doStuff(int t);
}

public class TestDeclare implements DeclareStuff {

	public static void main(String[] args) {
		int x = 5;
		new TestDeclare().doStuff(++x);
		
		List<String> s = new LinkedList();
		List s1 = new LinkedList<String>();
	}

	public void doStuff(int s) {
		s += EASY + ++s;
		System.out.println("s " + s);
	}
}
