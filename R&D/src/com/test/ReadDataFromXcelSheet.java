package com.test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ReadDataFromXcelSheet {
	
	static String fileData1 = null;
	
	public static void main(String[] args) {
		System.out.println("Enter the path of the file :");
		Scanner sc = new Scanner(System.in);
		File inputFile = new File(sc.nextLine());
		
		//System.out.println(readFile(inputFile));
		//writeToFile(inputFile);
		System.out.println(readStreamsFile(inputFile));
		
	}
	
	public static String readFile(File inputFile) {
		String line = null;
		try {
			BufferedReader br = new BufferedReader(new FileReader(inputFile));
			while((line = br.readLine()) != null) {
				if(fileData1 != null)
					fileData1 += line+"\n";
				else
					fileData1 = line+"\n";
		    }
			//fileData1 = br.readLine();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return fileData1;
	}
	
	public static void writeToFile(File inputFile) {
		System.out.println("Enter the data to be written in the file :");
		Scanner sc = new Scanner(System.in);
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter(inputFile));
			bw.write(fileData1+sc.nextLine());
			bw.flush();
			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static String readStreamsFile(File inputFile) {
		String line = null;
		try {
			FileInputStream fstream = new FileInputStream(inputFile);
			BufferedReader br = new BufferedReader(new InputStreamReader(fstream));
			while((line = br.readLine()) != null) {
				if(fileData1 != null)
					fileData1 += line+"\n";
				else
					fileData1 = line+"\n";
		    }
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return fileData1;
	}
	

}
