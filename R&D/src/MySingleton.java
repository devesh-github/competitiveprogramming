
public class MySingleton {

	public static MySingleton mySingleton;
	private MySingleton() {	}

	public static MySingleton getInstancesMySingleton() {
		if(mySingleton == null)
			return new MySingleton();
		else
			return mySingleton;
	}
	
	public static void main(String[] args) {

	}

}
