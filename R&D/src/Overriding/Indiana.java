package Overriding;

class x {
	public String m() {return "x";}
}

class y extends x {
	public String m() {return "y";}
}

class z extends y {
	public String m() {return "z";}
}

class A extends z{}

public class Indiana {
	public static void main(String[] args) {
		System.out.println(new A().m()+"Its correct");
	}
}
