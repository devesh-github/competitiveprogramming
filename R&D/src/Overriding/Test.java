package Overriding;


interface TestA {
	String toString();
}

class Person {
	String name = "No name";

	public Person(String nm) {
		// System.out.println(nm);
		name = nm;
	}
	/*
	 * public Person(){ System.out.println("No arg Peron contructor"); }
	 */
}

class Employee extends Person {
	String empID = "000";

	// String name = "000";
	public Employee(String id) {
		super(id);
		empID = id;
	}
}

class Employee2 extends Employee {
	String emp2ID = "000";

	public Employee2(String id) {
		super(id);
		emp2ID = id;
	}
}

public class Test {

	public static void test(String str) {
		int check = 4;
		if (check = str.length()) {
			System.out.print(str.charAt(check -= 1) + ", ");
		} else {
			System.out.print(str.charAt(0) + ", ");
		}
	}

	public static void main(String[] args) {
		/*
		 * System.out.println(new TestA() { public String toString() { return
		 * "test"; } });
		 */
		/*
		 * Employee2 emp = new Employee2("1234");
		 * System.out.println(emp.emp2ID); System.out.println(emp.empID);
		 * System.out.println(emp.name);
		 */

	}
}