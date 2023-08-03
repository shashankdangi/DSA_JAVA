package Lecture21;

public class LinkedList {
    public class Node {
        int data; // data stored in linked-list
        Node next; // reference variable for the node class as it's taking address of the node class object.
    }

    private Node head; //address of the head node
    private Node tail; //address of the tail node
    public int size; // size of the linked-list

    //adding value in the node
    public void addFirst(int item) {
        Node nn = new Node();
        nn.data = item;
        if (size == 0) {
            head = nn;
            tail = nn;
            size++;
        } else {
            nn.next = head;
            head = nn;
            size++;
        }
    }

    public void addLast(int item){
        Node nn = new Node();
        nn.data = item;
        if(size == 0){
            head = nn;
            tail = nn;
            size++;
        }else{
            tail.next = nn;
            tail = nn;
            size++;
        }
    }

    //Display the node
    void Display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "---->");
            temp = temp.next;
        }
        System.out.println(".");
    }


}
