package Hashing;

import java.util.HashMap;
import java.util.Map;

public class HashCodeAndEquals {
	int number ;
	
	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	@Override
	public int hashCode() {
		/*final int prime = 31;
		int result = 1;
		result = prime * result + number;*/
		return 2;
	}

	/*@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		HashCodeAndEquals other = (HashCodeAndEquals) obj;
		if (number != other.number)
			return false;
		return true;
	}*/

	public static void main(String[] args) {
		Map<HashCodeAndEquals,HashCodeAndEquals> m =
			new HashMap<HashCodeAndEquals, HashCodeAndEquals>();
		
		HashCodeAndEquals h1 = new HashCodeAndEquals();
		h1.setNumber(0);
		HashCodeAndEquals h2 = new HashCodeAndEquals();
		h2.setNumber(0);
		
		m.put(h1,h1);
		m.put(h2,h2);
		
		System.out.println(m);
		
		System.out.println(m.get(h1).getNumber());
		

	}

}
