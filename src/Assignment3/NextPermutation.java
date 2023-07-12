package Assignment3;

import java.util.Arrays;

public class NextPermutation {
    public static void main(String[] args) {
        int[] arr = {1,2,3}; //output should be [1,4,2,3,5];
        nextPermutation(arr);

    }
    static void nextPermutation(int[] arr){
        int n = arr.length;
        int pivot = 0;
        int i = 0;
        for( i = n-2; i>=0; i--){
            //this loop is only to find the pivot if it has any
            if(arr[i]<arr[i+1]){
                break;
            }
        }
        //if i iterated but didn't found any pivot mean we already in the last possible permutation
        if(i<0){
            reverse(arr,0,n-1);
        }else{ //if pivot is found
            pivot = i;
            for(int j = n-1; j>=0; j-- ){
                if(arr[j]>arr[pivot]){
                    int temp = arr[pivot];
                    arr[pivot] = arr[j];
                    arr[j] = temp;
                    break;

                }
            }
            reverse(arr,i+1,n-1);
        }
        System.out.println(Arrays.toString(arr));

    }

    static  void reverse(int[] arr , int i , int j){
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }

    }
}
