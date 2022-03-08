package Interview;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class StringFilter {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String s = "My name is Devesh Kumar Chaubey";
		
		String[] sc = s.split(" ");
		String sb = null;
		
		for(int i=0;i<sc.length;i++) {
			if(i%2!=0){
				continue;
			}
			if(sb!=null)
				sb = sb + sc[i];
			else
				sb = sc[i];
		}
		System.out.println(sb);
		
		try {
			//BufferedWriter bw = new BufferedWriter(new FileWriter(new File("devesh.txt")));
			PrintWriter bw = new PrintWriter(new File("test.txt"));
			bw.write(sb);
			bw.flush();
			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
