package Collections;
import java.util.*; 
public class Test3{
	public static void main(String a[]){
	Map s = new WeakHashMap(10);
	s.put(null,null);
	System.out.println(s);
	}
}
