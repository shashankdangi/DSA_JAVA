package Lecture22;

public class Cycle_Removal1 {
    public class Node{
        int data;
        Node next;
    }
    private Node head;
    private Node tail;
    public int size;

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
    public void CreateCycle() throws Exception{
        tail.next = getNode(2);

    }
    public Node HasCycle(){
        Node fast = head ;
        Node slow = head;
        while(fast != null && fast.next != null){
            fast  = fast.next.next;
            slow = slow.next;
            if(slow == fast){
                return slow;
            }
        }
        return null;
    }
    public void removalCycle1(){
        Node meet = HasCycle();
        if(meet == null){
            return;
        }
        Node slow = head;

        while(slow != null){
            Node temp = meet;
            while(temp.next != meet){
                if(temp.next == slow){
                    temp.next = null;
                    return;
                }
                temp = temp.next;
            }
            slow = slow.next;

        }
    }


    public static void main(String[] args) throws  Exception {
        Cycle_Removal cy = new Cycle_Removal();
        cy.addLast(1);
        cy.addLast(2);
        cy.addLast(3);
        cy.addLast(4);
        cy.addLast(5);
        cy.addLast(6);
        cy.addLast(7);
        cy.addLast(8);
        cy.Display();
        cy.CreateCycle();
        cy.removalCycle1();
        cy.Display();

    }
}
