package InstanceVariables;

public class BackHanded {
	int state = 0;

	BackHanded(int s) {
		state = s;
	}

	public static void main(String... hi) {
		BackHanded b1 = new BackHanded(1);
		BackHanded b2 = new BackHanded(2);
		//System.out.println(b1.go(b1) + " " + b2.go(b2));
		//System.out.println(b2.go(b2));
		
		String s = "";
		 System.out.println(020);
         if(011 == 9) s += 4;
         System.out.println(0xf);
         if(0x11 == 17) s += 5;
         Integer I = 12345;
         if(I.intValue() == Integer.valueOf("12345")) s += 6;
         System.out.println(s);

	}

	int go(BackHanded b) {
		System.out.println("111");
		if (this.state == 2) {
			b.state = 5;
			go(this);
			System.out.println("222");
		}
		System.out.println("333");
		return ++this.state;
	}
}
