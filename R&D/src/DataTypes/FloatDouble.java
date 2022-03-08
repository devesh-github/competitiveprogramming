package DataTypes;

public class FloatDouble {
	public static void method(float f){
	 System.out.println("Float");
	}

	public static void method(double f){
	 System.out.println("Double");
	}

	public static void main(String a[]){
	 float f1 = 2.0f;
	 float f2 = 2.0f;
	 method(1.0);
	 method(1.0f);
	 method(1.0f*2.0f);
	 method(1.0f*2.0);
	 method(f1*f2);
	}
}
