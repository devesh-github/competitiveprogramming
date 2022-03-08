package Exceptions;

public class TryCatchTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.println(returnTest());

	}

	public static int returnTest(){
		try{
			//int i = 9/0;
			//return 9;
			System.out.println("Before exit");
			System.exit(0);
		} catch(ArithmeticException e){}
		finally{
			System.out.println("finally");
		}
		return 0;
	}
}
