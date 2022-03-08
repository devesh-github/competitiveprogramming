package com.test;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ObjectComparison {

	int number;
	String name;
	
	ObjectComparison(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public static void main(String[] args) {
		ObjectComparison o1 = new ObjectComparison("aaa");
		ObjectComparison o2 = new ObjectComparison("bbb");
		ObjectComparison o3 = new ObjectComparison("aaa");
		Set<ObjectComparison> s = new HashSet<ObjectComparison>();
		s.add(o1);
		s.add(o2);
		s.add(o3);
		
		Iterator it = s.iterator();
		while(it.hasNext()) {
			//System.out.println(((ObjectComparison)it.next()).getName());
			System.out.println(((ObjectComparison)it.next()).getName());
		}

		/*for(ObjectComparison oc : s) {
			System.out.println(1);
			System.out.println(oc.name);
		}*/
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + number;
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ObjectComparison other = (ObjectComparison) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (number != other.number)
			return false;
		return true;
	}
	
	

}
