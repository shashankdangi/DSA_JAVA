package Assignment3;

import java.util.Scanner;

public class Arrays_InsertionSort {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i<n; i++){
            arr[i] = scn.nextInt();
        }
        sort(arr);
        for(int num : arr){
            System.out.print(num+" ");
        }



    }
    static void sort(int[] arr){
        int n = arr.length;
        for(int i = 1 ; i<n; i++){
            Insert_In_Sort(arr,arr[i],i-1);
        }
    }
    static void Insert_In_Sort(int[] arr , int item , int i ){
        int n = arr.length;
        while(i>=0){
            if(arr[i]>item){
                arr[i+1] = arr[i];
            }else{
                break;
            }
            i--;
        }
        arr[i+1] = item;
    }

}
