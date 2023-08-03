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

    public void AddatIndex(int k , int item) throws Exception {
        if(k == 0){
            addFirst(item);
        }else if (k == size){
            addLast(item);
        }else{
            Node k1 = getNode(k-1);
            Node nn = new Node();
            nn.data = item;
            nn.next = k1.next;
            k1.next = nn;
        }
    }
    public int getfirst(){
        return head.data;
    }
    public int getLast(){
        return tail.data;
    }
    public int getAtIndex(int k ) throws  Exception{
        return  getNode(k).data;
    }
    public Node getNode(int k) throws Exception{
        if(k<0 || k>=size){
            throw new Exception("K is not correct");
        }
        Node temp = head;
        for(int i = 0 ; i<k; i++){
            temp = temp.next;
        }
        return temp;
    }

}
