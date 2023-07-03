package LeetCode;

import java.util.Arrays;

public class sort {
    public static void main(String[] args) {
        int[] arr = {9,8,7,6,5,4,3,2,1,0};
        int i = 1;
        while(i<arr.length-1){
            int x = 0;
            while(x<arr.length-i){
                if(arr[i]>arr[i+1]){
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
                x++;
            }
            i++;
        }
        System.out.println(Arrays.toString(arr));
    }
}
