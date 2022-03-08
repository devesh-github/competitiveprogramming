package com.dev.collection;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class abc {

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {

		StringBuffer logMessage = null;
		
		FileOutputStream fos = null;
		File f = new File("someFile");
		try {
			fos = new FileOutputStream(f);
			// do something useful with fos here....
			fos.write(55);
			System.out.println(f.getAbsolutePath());
			System.out.println("Worked fine" + logMessage.toString());

		} finally {
			//System.out.println("Worked fine 2" + logMessage.toString());
			fos.close();
			//System.out.println("Worked fine 3");
		}

	}

}
