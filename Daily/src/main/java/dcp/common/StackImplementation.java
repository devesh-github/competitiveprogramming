package dcp.common;

class CustomStack {
    public int top = 0, size;
    public int[] stack;

    public void initialize(int size) {
        stack = new int[size];
        this.size = size;
    }

    public void push(int ele) throws Exception {
        if (top < size) {
            stack[top++] = ele;
        } else {
            throw new Exception("Stack is full");
        }
    }

    public int pop() throws Exception {
        if (top != 0) {
            return stack[--top];
        } else {
            throw new Exception("Stack is empty");
        }

    }

    public int peek() throws Exception {
        if (top != 0) {
            return stack[top];
        } else {
            throw new Exception("Stack is empty");
        }
    }

    public int currentSize() throws Exception {
        return top;
    }
}

public class StackImplementation {

    public static void main(String[] args) {
        CustomStack s = new CustomStack();
        s.initialize(10);
        try {
            s.push(10);
            s.push(20);
            s.push(30);
            s.push(40);
            s.push(40);
            s.push(40);
            s.push(40);
            s.push(40);
            s.push(60);
            s.push(50);

            System.out.println(s.pop());
            System.out.println(s.pop());
            System.out.println(s.currentSize());

            System.out.println(s.peek());
            System.out.println(s.currentSize());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
