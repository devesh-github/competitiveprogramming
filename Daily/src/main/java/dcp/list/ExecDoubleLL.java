package dcp.list;

public class ExecDoubleLL {

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

        /*DoubleLinkedList dll1 = new DoubleLinkedList();
        DoubleLinkedList dll2 = new DoubleLinkedList();
        DoubleLinkedList dll3 = new DoubleLinkedList();

        head.setData(null);
        head.setLpointer(dll1.getFpointer());

        dll1.setFpointer(11);
        dll2.setFpointer(22);
        dll3.setFpointer(33);

        dll1.setData(emp1);
        dll1.setLpointer(dll2.getFpointer());

        dll2.setData(emp2);
        dll2.setLpointer(dll3.getFpointer());

        dll3.setData(emp3);
        dll3.setLpointer(0);

        //Traversal
        while(head.getLpointer()!=0) {
            System.out.println(head.getData().toString());
            head.getFpointer().get
        }*/


    }

}
