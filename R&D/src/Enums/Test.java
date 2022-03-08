package Enums;

public class Test {
	public enum Dogs {
		collie, harrier, shepherd
	};

	public static void main(String[] args) {
		Dogs myDog = Dogs.shepherd;
		// switch (myDog) {
		switch (Dogs.shepherd) {
		case collie:
			System.out.print("collie ");
			// case default:
		default:
			System.out.print("retriever ");
		case harrier:
			System.out.print("harrier ");
		}
	}
}
