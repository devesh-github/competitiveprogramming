package UCertify;

import java.util.Arrays;

public class Search {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] arr = {"sun","scjp","cerification"};
		Arrays.sort(arr);
		System.out.println(Arrays.binarySearch(arr, "cerification"));
		//System.out.println(Arrays.binarySearch(arr, "you"));
		System.out.println(Arrays.binarySearch(arr, "sv"));
	}

}
