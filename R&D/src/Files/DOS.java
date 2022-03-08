package Files;

import java.io.*;

public class DOS {
	public static void main(String[] args) {
		File dir = new File("Dir");
		dir.mkdir();
		File f1 = new File(dir, "File1.txt");
		try {
			f1.createNewFile();
			FileWriter fw = new FileWriter(f1);
			fw.write("FileWriter");
			fw.close();
			/*PrintWriter pw = new PrintWriter(f1);
			pw.write("PrintWriter");
			pw.close();*/
			
		} catch (IOException e) {
			;
		}
		File newDir = new File("newDir");
		dir.renameTo(newDir);
	}
}
