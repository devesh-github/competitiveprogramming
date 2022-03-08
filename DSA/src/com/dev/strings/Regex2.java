package ved.strings;

import java.util.regex.*;

class Regex2 {
	public static void main(String[] args) {
		//Pattern p = Pattern.compile(args[0]);
		//Matcher m = p.matcher(args[1]);
		
		Pattern p = Pattern.compile("d");
		Matcher m = p.matcher("abcddddddefffff");
		boolean b = false;
		while (b = m.find()) {
			System.out.print(m.start() + m.group());
		}
	}
}