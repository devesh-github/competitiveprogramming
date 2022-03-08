package Overriding;

public class Base {
	 public String FOO = "foo";
	 public static void main(String[] args) {
	 Base b = new Base();
	 Sub s = new Sub();
	 //System.out.print(Base.FOO);
	 //System.out.print(Sub.FOO);
	 System.out.print(b.FOO);
	 System.out.print(s.FOO);
	 System.out.print(((Base)s).FOO);
	 //System.out.print(((Sub)b).FOO);
	 } }
	 class Sub extends Base {//public String FOO="bar";
	 }
