package PracticeSet1;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

class Files {

 public static void main(String[] args){
	 //String name = "testDir" + File.separator + "subDir2" + File.separator + "Shackelton.txt";
	 String name = "Shackelton.txt";
	 System.out.println(name);
	 //File f = new File("./"+name);
	 File f = new File(name);
	 FileWriter fw; 
	 System.out.print("auexists " + f.exists());
	 try {
		//f.createNewFile();
		fw = new FileWriter(f);
		fw.write("hi i am devesh");
		fw.flush();
		fw.close();
		
		FileReader fr = new FileReader(f);
		char[] read = new char[20]; 
		fr.read(read);
		for(char c:read)
			System.out.print(c);
		fr.close();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 System.out.print(" exists " + f.exists());
 }
}

