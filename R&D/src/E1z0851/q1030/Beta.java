package E1z0851.q1030;

interface Foo {
	int bar();
}

public class Beta {
	
	//Inner Class
	class A implements Foo {
		public int bar() { return 1; }
	}
	
	public int fubar( Foo foo) { return foo.bar();}
		
	//method local inner class
	public void testFoo() {
		class A implements Foo{
			public int bar() { return 2; }
		}
		System.out.println(fubar(new A()));
	}
	
	public static void main(String[] argv){
		new Beta().testFoo();
	}
}
