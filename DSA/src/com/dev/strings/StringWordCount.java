package ved.strings;

public class StringWordCount {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String test = "Hi Devesh";
		System.out.println(test.length()); //9
		
		//Code Implementation
		char[] testCharArray = test.toCharArray();
		int count=0;
		for(int i=0;i<testCharArray.length;i++)
		{
			count++;
		}
		System.out.println(count);

	}

}
