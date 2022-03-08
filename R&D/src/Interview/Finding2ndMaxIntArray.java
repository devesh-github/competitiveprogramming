package Interview;

public class Finding2ndMaxIntArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int []intArray = {2,4,8,4,89};
		int max1=0;
		int max2=0;
		
		for(int i=0;i<intArray.length;i++){
			if(intArray[i]>max1){
				max2 = max1;
				max1 = intArray[i];
			}
		}
		
		System.out.println(max1);
		System.out.println(max2);
		
	}

}
