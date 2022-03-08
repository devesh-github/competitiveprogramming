package Strings;

public class TestString3 {
	public static void main(String[] args) {
		String s = "123456789";
		//s = (s - "123").replace(1, 3, "24") - "89";
		
		StringBuffer s1 = new StringBuffer("123456789");
		s1.delete(0, 3).replace(1, 3, "24").delete(4, 6);
		System.out.println(s1);
		
		/*StringBuffer s2 = new StringBuffer("123456789");
		s2.substring(3, 6).delete(1, 3).insert(1, "24");
		System.out.println(s2);
		
		StringBuilder s3 = new StringBuilder("123456789");
		s3.substring(3, 6).delete(1, 2).insert(1, "24");
		System.out.println(s3);*/
		
		StringBuilder s4 = new StringBuilder("123456789");
		s4.delete(0, 3);
		System.out.println(s4);
		s4.delete(1, 3);
		System.out.println(s4);
		s4.delete(2, 5);
		System.out.println(s4);
		s4.insert(1, "24");
		System.out.println(s4);
		
		String test = "Test A. Test B. Test C.";
		String regex = "";
		//regex = " ";
		//regex = ".*";
		//regex = "\\s";
		regex = "\\.\\s*";
		//regex = "\\w[\\.] +";
		String[] result = test.split(regex);
		for (String ss : result){
			System.out.println(ss);
		}
	}
}
