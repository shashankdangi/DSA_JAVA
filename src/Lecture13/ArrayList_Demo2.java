package Lecture13;

import java.util.ArrayList;

public class ArrayList_Demo2 {
    public static void main(String[] args) {
        ArrayList<Integer> ll = new ArrayList<>();
        ll.add(20);
        ll.add(13);
        ll.add(40);
        for(int num : ll){
            System.out.println(num);
        }
    }
}
