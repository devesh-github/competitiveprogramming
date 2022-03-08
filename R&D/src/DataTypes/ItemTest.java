package DataTypes;

public class ItemTest {

	private final int id;

	/*public ItemTest(int id) {
		System.out.println(this.id);
		this.id = id;
	}*/
	
	public ItemTest() {
		System.out.println(this.id);
		//this.id = 90;
	}

	public void updateId(int newId) {
		//id = newId;
	}

	public static void main(String[] args) {
		ItemTest fa = new ItemTest();
		System.out.println(fa.id);
		fa.updateId(69);
		System.out.println(fa.id);
	}
}
