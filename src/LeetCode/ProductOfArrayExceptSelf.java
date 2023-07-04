package LeetCode;

import java.util.Arrays;

public class ProductOfArrayExceptSelf {
    public static void main(String[] args) {
        int[] arr = {2,3,4,6};
        int n = arr.length;
        int[] multiple = new int[n];
        int[] left  = new int[n];
        int[] right = new int[n];
        left[0] = 1;
        int mul = 1;
        for(int i = 1 ; i<n;i++){
            mul *= arr[i - 1];
            left[i] = mul;
        }
        right[n-1] = 1;
        mul = 1;
        for(int i = n-2; i>=0;i--){
            mul *= arr[i+1];
            right[i] = mul;
        }
        for(int i = 0; i<n;i++){
            multiple[i] = right[i]*left[i];
        }
        System.out.println(Arrays.toString(left));
        System.out.println(Arrays.toString(right));
        System.out.println(Arrays.toString(multiple));


    }
}
