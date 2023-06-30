package LeetCode;

import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        times(arr,3);


    }
    static  void times(int[] arr, int k){


        while(k>0){
            int temp = arr[arr.length - 1];
            rotate(arr);
            k--;
            arr[0] = temp;


        }


        System.out.println(Arrays.toString(arr));

    }

    static void rotate(int[] arr  ){
        int i = arr.length-2;

        while(i>=0){

            arr[i+1] = arr[i];
            i--;
        }




    }


}

