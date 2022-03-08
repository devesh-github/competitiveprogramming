package Collections;

import java.util.*;

class Per //implements Comparable{
{
	//int i;
	Per(int i){
		//this.i = i;
	}
	
	/*int getI(){
		return this.i;
	}
	
	@Override
	public int compareTo(Object arg0) {
		// TODO Auto-generated method stub
		//return (int) Math.random();
		return ((Per)arg0).i;
	}*/	
}

public class Test1 {
	public static void main(String a[]){
		Set s = new TreeSet();
		s.add(new Per(20));
		s.add(new Per(10));
		/*for(Per p:s){
			System.out.println();
		}*/
		/*Iterator i = s.iterator();
		while(i.hasNext())
			System.out.println(((Per)i.next()).getI());*/
		System.out.println(s);
	}
}