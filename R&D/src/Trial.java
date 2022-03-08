
public class Trial {
	
	public void Trial(){
		System.out.println("abc");
	}
	
	void add(String ...a) {
		System.out.println("String");
	}
	
	void add(float a) {
		System.out.println("float");
	}
	
	void add(int a) {
		System.out.println("Integer");
	}
	
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Trial tr = new Trial();
		//tr.add(null);
		tr.add(0f);
		
	}

}
