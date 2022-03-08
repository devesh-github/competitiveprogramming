package com.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LogicalOrRegexDemo {
	public static void main(String[] args) {
		//String regex = "[t|T]";
		String regex = "[/,:<>!~@#$%^&()+=?()\"!\\[#$-]	"; 
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher("Deves\"h");
		while (matcher.find()) {
			System.out.format("Text \"%s\" found at %d to %d.%n", matcher.group(), matcher.start(), matcher.end());
		}
	}
}
