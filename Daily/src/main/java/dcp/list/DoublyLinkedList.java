package dcp.list;

import java.util.ArrayList;
import java.util.List;

class Node {
    public Node fpointer;
    public Employee data;
    public Node lpointer;

    public Node getFpointer() {
        return fpointer;
    }

    public void setFpointer(Node fpointer) {
        this.fpointer = fpointer;
    }

    public Employee getData() {
        return data;
    }

    public void setData(Employee data) {
        this.data = data;
    }

    public Node getLpointer() {
        return lpointer;
    }

    public void setLpointer(Node lpointer) {
        this.lpointer = lpointer;
    }
}

public class DoublyLinkedList {

    Node head;

    public Node getHead() {
        return head;
    }

    public Node setHead(Node n) {
        return this.head = n;
    }

    public void add(Employee emp) {
        Node n = new Node();
        n.setData(emp);
        if(getHead()==null) {
            Node head = new Node();
            setHead(head);
            getHead().setLpointer(n);
        } else {
            Node head = getHead();
            while(head.lpointer!=null) {
                head.lpointer = head.getLpointer().getLpointer();
            }
            head.setLpointer(n);
        }
    }

    public void traverse() {
        Node head = getHead();
        while(head.lpointer!=null) {
            System.out.println(head.getData().toString());
            head.lpointer = head.getLpointer().getLpointer();
        }
    }

}
