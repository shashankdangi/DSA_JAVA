package Lecture21;

public class LinkedList_Client {
    public static void main(String[] args) {
        LinkedList q = new LinkedList();
        q.addFirst(21);
        q.addFirst(45);
        q.addFirst(67);
        q.Display();
        q.addLast(10);
        q.Display();
        q.addFirst(90);
        q.Display();
    }
}
