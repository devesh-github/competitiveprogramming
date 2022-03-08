package Inheritance;

class GardenTool {
	static String s = "";
	String name = "Tool ";

	/*GardenTool(String arg) {
		this();
		System.out.println(arg);
		s += name;
	}*/

	GardenTool() {
		s += "gt ";
	}
}

public class Rake extends GardenTool {
	{
		name = "Rake ";
	}

	Rake(String arg) {
		System.out.println(arg);
		s += name;
	}

	public static void main(String[] args) {
		//new GardenTool("hey ");
		new Rake("hi ");
		System.out.println(s);
	}

	{
		name = "myRake ";
	}
}
