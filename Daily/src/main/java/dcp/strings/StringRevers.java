package dcp.strings;

public class StringRevers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String test = "Hi Devesh";
		System.out.println(test.length()); //9
		
		//Code Implementation
		char[] testCharArray = test.toCharArray();
		System.out.println(testCharArray.length);
		
		char[] reversedArray = new char[testCharArray.length];
		
		for(int i=0,j=testCharArray.length;i<testCharArray.length;i++,j--)
		{
			reversedArray[i] = testCharArray[j-1];
			//System.out.print(reversedArray[i]);
		}
		
		System.out.println(test);
		System.out.println(reversedArray);
		
		//Converting Char array to String
		
		//Way 1
		String reversedString = new String(reversedArray);
		
		//Way 2
		String text = String.copyValueOf(reversedArray);
		System.out.println(text);
		
		//Way 3s
		String text2 = String.valueOf(reversedArray);
		System.out.println(text2);

	}
}
