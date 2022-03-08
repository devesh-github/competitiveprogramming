package DataTypes;

class Converter {
	 public static void main(String[] args) {
	 //Integer i = Integer.parseInt(args[0]);
	 Integer i = Integer.valueOf(args[0]);
	 int j = 12;
	 Integer i2 = new Integer("12");
	 Integer i3 = i;
	 System.out.println("It is " + (j==i) + " that j==i.");
	 System.out.println(i==i2);
	 System.out.println(i.equals(i2));
	 
	 System.out.println(i==i3);
	 System.out.println(i.equals(i3));
	 }
}
