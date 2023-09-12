package HEAP;

import java.util.PriorityQueue;

public class KTH_LEETCODE {
    public static void main(String[] args) {
        int []arr = {3,2,3,1,2,4,5,5,6};
        int k = 3;
    }
    static int kth_largest(int[] arr, int k){
        PriorityQueue<Integer> pa = new PriorityQueue<>();
        for(int i = 0 ; i < k ; i++){
            pa.add(arr[i]);
        }
        for(int i = k ; i < arr.length; i++){
            if(pa.peek() < arr[i]){
                pa.poll(); // remove
                pa.add(arr[i]);
            }
        }
        return pa.peek();
    }
}

