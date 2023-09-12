package HEAP;

import java.util.PriorityQueue;

public class min_sum_pair {
    public static void main(String[] args) {
        int[] arr = {3,2,3,2,4,1};
    }
    public static int minSum(int[]arr){
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i = 0 ; i < arr.length ; i++){
            pq.add(arr[i]);
        }
        int sum = 0 ;
        while(pq.size() > 1){
            int a = pq.poll();
            int b = pq.poll();
            sum = sum + a + b;
            pq.add(a + b);
        }
        return sum;
    }
}
