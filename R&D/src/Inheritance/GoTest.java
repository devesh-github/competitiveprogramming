package Inheritance;

public class GoTest {
	public static void main(String[] args) {
		Sente s = new Sente(); s.go();
		Goban g = new Goban(); g.go();
		Stone st = new Stone(); st.go();
	}
}

interface Go {
	public void go();
}

class Sente implements Go {
	public void go() {
		System.out.println("Sente");
	}
}

class Goban implements Go {
	public void go() {
		System.out.println("Goban");
	}
}

class Stone extends Goban implements Go {
}
