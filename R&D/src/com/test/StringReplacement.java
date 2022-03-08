package com.test;

public class StringReplacement {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String sc = "aaa bbb ccc ddd eee nnn fff";
		String startTag = "bbb";
		String endTag = "ddd";
		String origSigVal = sc.substring(sc.indexOf(startTag) + startTag.length(), sc.indexOf(endTag));
		String newSigVal = origSigVal.replaceAll("[\n\r]", "k").trim();
		System.out.println("========="+origSigVal+"=========");
		System.out.println("========="+newSigVal+"=========");
		sc = sc.replace(origSigVal,newSigVal);
		System.out.println("========="+sc+"=========");
	}
}
