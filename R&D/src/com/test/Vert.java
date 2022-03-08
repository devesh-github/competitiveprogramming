package com.test;

class Blip {
	protected int blipvert(int x) { return 0; }
}

public class Vert extends Blip {
	
	//Cant reduce the visibility of inherited method
	//private int blipvert(int x) { return 0; }
	
	//Return type is incompatible
	//public long blipvert(int x) { return 0; }
	
	//Cant reduce the visibility of inherited method
	//private int blipvert(int x) { return 0; }

	//Return type is incompatible
	//protected long blipvert(int x) { return 0; }

	//public int blipvert(int x) { return 0; }
	//private int blipvert(long x) { return 0; }
	protected int blipvert(int x) { return 3; }
	protected int blipvert(long x) { return 0; }
	//protected long blipvert(long x) { return 0; }
	protected long blipvert(int x, int y) { return 6; }
	
	public static void main(String[] args)
	{
		Vert v = new Vert();
		System.out.println(v.blipvert(0));
		System.out.println(v.blipvert(0,0));
	}
}


