package com.test;

import java.io.File;
import java.util.Scanner;

public class NoOfFilesinDirectory {

	/**
	 * @param args
	 */
	/*
	 * public static void main(String[] args) { Scanner sc = new
	 * Scanner(System.in); //Scanner sc = new Scanner("abc");
	 * while(sc.hasNext()) System.out.println(sc.next());
	 * 
	 * }
	 */

	public static void main(String[] args) {
		// Prompt the user to enter a directory or a file
		System.out.print("Enter a directory or a file: ");
		Scanner input = new Scanner(System.in);
		String file = input.nextLine();
		
		/*System.out.println(file);
		System.out.println(new File(file).isDirectory());
		File[] files = new File(file).listFiles();
		System.out.println(files.length);*/
		
		// Display the size
		System.out.println(getSize(new File(file)) + " files");
	}

	public static long getSize(File file) {
		// Store the total size of all files
		long size = 0;
		if (file.isDirectory()) {
			// All files and subdirectories
			File[] files = file.listFiles();
			for (int i = 0; i < files.length; i++) {
				// Recursive call
				size += getSize(files[i]);
			}
		}
		// Base case
		else {
			size += 1;
		}
		return size;
	}

}
