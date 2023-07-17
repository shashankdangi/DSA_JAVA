package Assignment3;

import java.util.Scanner;

public class Array_BubbleSort {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ;i<n; i++){
            arr[i] = scn.nextInt();
        }
        BubbleSort(arr,n);


    }
    static void BubbleSort(int[] arr, int n){
        for(int i = 0 ; i<n; i++){
            for(int j = 0 ; j<n-1; j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for(int num : arr){
            System.out.println(num);
        }
    }
}
