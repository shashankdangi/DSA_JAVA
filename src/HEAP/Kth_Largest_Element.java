package HEAP;

import java.util.Collections;
import java.util.PriorityQueue;

public class Kth_Largest_Element {
    public static void main(String[] args) {
//        PriorityQueue<Integer> pq = new PriorityQueue<>(); MIN HEAP
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder()); // MAX HEAP
        pq.add(4);
        pq.add(5);
        pq.add(7);
        pq.add(1);
        pq.add(6);
        pq.add(9);
        pq.add(3);
        System.out.println(pq);
    }
}
