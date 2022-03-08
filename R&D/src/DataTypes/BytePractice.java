package DataTypes;

public class BytePractice {

	public static void main(String a[]) {
		byte b = 100;
		Byte b1 = new Byte(100);
		Byte b2 = new Byte(b);
		System.out.println(b1 == b2);
		System.out.println(b1.equals(b2));

	}
}
