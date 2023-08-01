package Lecture20;

public class Stack_Client {
    public static void main(String[] args) throws Exception {
        Stack s = new Stack();
        s.push(10);
        System.out.println(s.isFull());
        System.out.println(s.peek());
    }

}
