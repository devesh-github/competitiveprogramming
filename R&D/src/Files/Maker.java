package Files;

import java.io.File;
import java.io.IOException;

public class Maker {
	public static void main(String[] args) {
		File dir = new File("dir");
		dir.mkdir();
		File f = new File(dir, "f");
		try {
			f.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
