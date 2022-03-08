/**
 * 
 */
package com.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


/**
 * @author r.kachinatte.ramatpa
 *
 */
public class PaccTest {

	public static void main(String arg[]){
		//String term = "HelloWorld666"; 
		boolean isChar = false;
		boolean isDigit = false;
		boolean isSpecialChar = false;
		int length;
		
		String[] termSeq = {"555Hello","HelloWor","Hello777","333Hello222World666","He66W2or",
				"He55oWo!","He55oWo@","He55oWo#","He55oWo$","He55oWo%","He55oWo^","He55oWo&",
				"He55oWo*","He55oWo(","He55oWo)","He55oWo_","He55oWo-","He55oWo+","He55oWo=",
				"He55oWo]","He55oWo[","He55oWo}","He55oWo{","He55oWo|","He55oWo\\","He55oWo\"",
				"He55oWo:","He55oWo'","He55oWo;","He55oWo/","He55oWo?","He55oWo>","He55oWo<",
				"He55oWo,","He55oW1,"};
		
		for(int stringCount=0;stringCount<termSeq.length;stringCount++) {
			String term = termSeq[stringCount];
			isChar = false;
			isDigit = false;
			isSpecialChar = false;
			length = term.length();
			System.out.println("Term["+stringCount+"] :: "+term+" Length :: "+length);
		
			if(length == 8) {
				
				for(int count=0;count<length;count++) {
					
					String sbString = term.substring(count, count+1);
					//System.out.println("Substring :: "+sbString);
					if (sbString.matches("[a-zA-Z]")) {
						isChar = true;
						//System.out.println("isChar :: "+isChar);
					} else if (sbString.matches("[0-9]")) {
						isDigit = true;
						//System.out.println("isDigit :: "+isDigit);
					} else if (sbString.matches("[!@#$%^&*()_-]")) {
						isSpecialChar = true;
						//System.out.println("isSpecialChar :: "+isSpecialChar);
					} else if (sbString.matches("[+={}|\\:;/?><.,'\"]")) {
						isSpecialChar = true;
					}
				}
				
				if(isChar && isDigit && isSpecialChar) {
				//if(isChar && isDigit) {
					//System.out.println("Alphanumeric :: "+term);
				} else {
					System.out.println("Not Alphanumeric :: "+term);
				}

			} else {
				//System.out.println("Term Length is greater or lesser than 8 ");
			}
		}
		
		/*String term1 = "Hello-World";   
		boolean found = false;   
		Pattern p = Pattern.compile("\\W+*");   
		Matcher m = p.matcher(term);   
		if(m.find())     
			found = true; 
		System.out.println(found);*/
	}
}
