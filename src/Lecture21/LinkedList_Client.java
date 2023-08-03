package Lecture21;

public class LinkedList_Client {
    public static void main(String[] args) throws Exception {
        LinkedList q = new LinkedList();
        q.addFirst(21);
        q.addFirst(45);
        q.addFirst(67);
        q.Display();
        q.addLast(10);
        q.Display();
        q.addFirst(90);
        q.Display();
        System.out.println(q.getNode(4));
        q.AddatIndex(4,9876);
        q.Display();
    }
}
