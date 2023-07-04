package LeetCode;

import java.util.Arrays;

public class TrappingRainWater {
    public static void main(String[] args) {
        int[] arr = {0,1,0,2,1,0,1,3,2,1,2,1};
        int n = arr.length;
        int[] left = new int[n];
        int[] right = new int[n];
        left[0] = arr[0];
        for(int i = 1; i<n;i++){
            left[i] = Math.max(left[i-1], arr[i]);
        }
        right[n-1] = arr[n-1];
        for(int j = n-2; j>=0; j--){
            right[j] = Math.max(right[j+1], arr[j]);
        }
        int water = 0;

        for(int k = 0; k < arr.length; k++){
            water += (Math.min(left[k],right[k]) - arr[k]);
        }


        System.out.println(Arrays.toString(left));
        System.out.println(Arrays.toString(right));
        System.out.println(water);

    }
}
