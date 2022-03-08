package ocjp.assessmenTest1;

public class Bunnies {
	int count ;//default value is 0

	Bunnies() {
		while (count < 10)
			new Bunnies(++count);
	}

	Bunnies(int x) {
		super();
	}

	public static void main(String[] args) {
		//new Bunnies();
		//new Bunnies(count);
		System.out.println(new Bunnies().count++);
		for(int i=6,j=7;i<10;){
			
		}
	}
}
