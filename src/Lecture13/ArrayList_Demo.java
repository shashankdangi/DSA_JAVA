package Lecture13;

import java.util.ArrayList;

public class ArrayList_Demo {
    public static void main(String[] args) {
        ArrayList<Integer> ll = new ArrayList<>();
        ll.add(20);
        ll.add(30);
        ll.add(0,-1);
        System.out.println(ll);
        System.out.println(ll.get(2));
        ll.set(0,22);
        System.out.println(ll.remove(2));
        System.out.println(ll);
    }
}
