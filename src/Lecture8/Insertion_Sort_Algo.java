package Lecture8;

import java.util.Arrays;

public class Insertion_Sort_Algo {
    public static void main(String[] args) {
        int[] arr = {1,12,14,15,2};
        int n = arr.length;
        sort(arr);

    }
    static void sort(int[] arr){
        for(int i = 1; i<arr.length; i++){
            Insert_in_Sort(arr,arr[i],i-1);
        }
        System.out.println(Arrays.toString(arr));
    }
    static void Insert_in_Sort(int[] arr , int item , int i ){
        while(i>=0 && arr[i]>item){
            arr[i+1] = arr[i];
            i--;
        }
        arr[i+1] = item;
    }
}
