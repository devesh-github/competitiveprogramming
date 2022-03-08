package ved.strings;

import java.io.*;

class Keyboard {
}

public class Computer implements Serializable {
	private Keyboard k = new Keyboard();

	public static void main(String[] args) {
		Computer c = new Computer();
		c.storeIt(c);
	}

	void storeIt(Computer c) {
		try {
			ObjectOutputStream os = new ObjectOutputStream(
					new FileOutputStream("myFile"));
			os.writeObject(c);
			os.close();
			System.out.println("done");
		} catch (Exception x) {
			System.out.println("exc"+x);
		}
	}
}