package Collections;

import java.util.*;

public class MyFriends {
	String name;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MyFriends other = (MyFriends) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	MyFriends(String s) {
		name = s;
	}

	public static void main(String[] args) {
		Set<MyFriends> ms = new HashSet<MyFriends>();
		ms.add(new MyFriends("Bob"));
		System.out.print(ms + " ");
		ms.add(new MyFriends("Bob"));
		System.out.print(ms + " ");
		ms.add(new MyFriends("Eden"));
		System.out.print(ms + " ");
	}

	public String toString() {
		return name;
	}
}
