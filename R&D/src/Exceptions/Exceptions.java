package Exceptions;
class Exception1 extends Exception{}
class Exception2 extends Exception{}

public class Exceptions {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try{
			try{
				//Exception1 e1 = new Exception1();
				throw new Exception2();
			/*}catch(Exception1 e1){
				System.out.println("Exception1");*/
			}catch(ArrayIndexOutOfBoundsException e1){
				System.out.println("Exception2");
			}finally{
				System.out.println("Inside inner finally");
			}
		}catch(Exception e){
			System.out.println("Exception");
			try{
				//Exception1 e1 = new Exception1();
				throw new Exception2();
			/*}catch(Exception1 e1){
				System.out.println("Exception1");*/
			}catch(Exception2 e1){
				System.out.println("11-----Exception2");
			}finally{
				System.out.println("11-----Inside inner finally");
			}
		}finally{
			System.out.println("Inside outer finally");
			try{
				//Exception1 e1 = new Exception1();
				throw new Exception2();
			/*}catch(Exception1 e1){
				System.out.println("Exception1");*/
			}catch(Exception2 e1){
				System.out.println("22-----Exception2");
			}finally{
				System.out.println("22-----Inside inner finally");
			}
		}

	}

}
