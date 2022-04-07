package dcp.list;

public class ExecDoublyLL {

    public static void main(String[] args) {

        Employee emp1 = new Employee();
        emp1.setFname("a");
        emp1.setLname("l");
        emp1.setId("1");

        Employee emp2 = new Employee();
        emp2.setFname("b");
        emp2.setLname("l");
        emp2.setId("2");

        Employee emp3 = new Employee();
        emp3.setFname("a");
        emp3.setLname("l");
        emp3.setId("3");

        DoublyLinkedList dll = new DoublyLinkedList();
        dll.add(emp1);
        dll.add(emp2);
        dll.add(emp3);
        dll.traverse();
    }

}
