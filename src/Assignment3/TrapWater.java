package Assignment3;

import java.util.Arrays;

public class TrapWater {
    public static void main(String[] args) {
        int[] arr = {3,0,0,2,0,4};
        int n = arr.length;
        int[] left = new int[n];
        int[] right = new int[n];
        right[0] = arr[0];
        for(int i = 1 ; i<n; i++){
            right[i] = Math.max(right[i-1],arr[i]);
        }
        left[n-1] = arr[n-1];
        for(int i = n-2; i>=0; i--){
            left[i] = Math.max(left[i+1],arr[i]);
        }
        int sum = 0;
        for(int i = 0 ; i<n; i++){
            sum += Math.min(left[i],right[i])-arr[i];
        }
        System.out.println(sum);
    }
}
