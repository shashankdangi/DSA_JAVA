package Assignment3;

import java.util.Scanner;

public class Arrays_SelectionSort {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        long[] arr = new long[n];
        for(int i = 0 ; i<n; i++){
            arr[i] = scn.nextLong();
        }
        Selection_Sort(arr);
        for(int i = 0 ; i<n; i++){
            System.out.println(arr[i]);
        }


    }
    static void Selection_Sort(long[] arr){
        int n = arr.length;
        for(int i = 0 ; i<n; i++){
            for(int j = i+1; j<n;j++){
                if(arr[j]<arr[i]){
                    long temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
    }
}
