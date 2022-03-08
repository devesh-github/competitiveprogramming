package Static;

public class StaticLocalVar {

	static final String s = "Instance";

	public static void method(String s) {
		s += "Add";
	}

	public static void main(String a[]){
		StaticLocalVar t = new StaticLocalVar();
		  //s = "New Instance";
		  String s = "Local";
		  method(s);
		  System.out.println(s);
		  System.out.println(t.s);
		  method(t.s);
		  System.out.println(t.s);
		  //System.out.println(StaticLocalVar.s);
		}
}
