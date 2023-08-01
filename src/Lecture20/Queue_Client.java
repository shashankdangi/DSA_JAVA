package Lecture20;

public class Queue_Client {
    public static void main(String[] args) throws Exception {
        Queue q = new Queue();
        q.Enqueue(10);
        q.Enqueue(20);
        q.Enqueue(50);
        System.out.println(q.Dequeue());
        System.out.println(q.Dequeue());
        q.Enqueue(60);
        q.Enqueue(70);
        q.Display();
    }
}
