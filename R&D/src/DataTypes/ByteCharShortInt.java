package DataTypes;

public class ByteCharShortInt {

	public static void main(String a[]){
		  final byte b = 1;
		  char c = 2;
		  short s = 3;
		  int i = 4;

		  c = b; // 1
		  s = b; // 2
		  i = b; //3
		  s = c * b; //4
		}
}
