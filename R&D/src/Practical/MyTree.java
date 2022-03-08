package Practical;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class MyTree {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<Integer> t = new ArrayList<Integer>();
		t.add(0);
		t.add(8);
		t.add(2);
		Stack a = new Stack();
		a.addAll(t);
		System.out.println(a);
		//http://en.literateprograms.org/index.php?title=Special:DownloadCode/Depth-first_search_(Java)&oldid=11979
	}

}
