package Assignment3;

import java.util.Arrays;

public class Sort_Just_Zeroes_and_Ones {
    public static void main(String[] args) {
        int[] arr = {1,0,0,1,1,0,1};
        Sort(arr);

    }
    static void Sort(int[] arr){
        int n = arr.length;
        for(int i = 0 ; i<n; i++ ){
            Insertion_Sort(arr,arr[i],i-1);
        }
        System.out.println(Arrays.toString(arr));
    }
    static void Insertion_Sort(int[] arr, int item , int i ){
        int n = arr.length;
        while(i>=0 && arr[i]>item ){
            arr[i+1] = arr[i];
            i--;
        }
        arr[i+1] = item;
    }
}
