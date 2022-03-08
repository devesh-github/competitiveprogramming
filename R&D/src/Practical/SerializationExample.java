package Practical;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileOutputStream fs = new FileOutputStream("devesh.txt");
			try {
				ObjectOutputStream os = new ObjectOutputStream(fs);
				os.writeObject("Hello : I did serialization example");
				fs.close();
				os.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

		FileInputStream fs2;
		String s = null;
		try {
			fs2 = new FileInputStream("devesh.txt");
			ObjectInputStream os2 = new ObjectInputStream(fs2);
			try {
				s = os2.readObject().toString();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(s);
			fs2.close();
			os2.close();
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
