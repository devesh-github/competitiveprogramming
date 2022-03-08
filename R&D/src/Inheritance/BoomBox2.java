package Inheritance;

class Stereo {
	void makeNoise() {
		assert true;
	}
}

public class BoomBox2 extends Stereo {
	public static void main(String[] args) {
		new BoomBox2().go(args);
	}

	void go(String[] args) {
		if (args.length > 0)
			makeNoise();
		if (args[0].equals("x"))
			System.out.print("x ");
		if (args[0] == "x")
			System.out.println("x2 ");
	}
}
